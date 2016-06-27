package edu.co.sena.ejemplo1.presentacion.managerbeans;

import edu.co.sena.ejemplo1.integracion.entities.Cuenta;
import edu.co.sena.ejemplo1.presentacion.managerbeans.util.JsfUtil;
import edu.co.sena.ejemplo1.presentacion.managerbeans.util.PaginationHelper;
import edu.co.sena.ejemplo1.negocio.ejbs.CuentaFacade;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@Named("cuentaController")
@SessionScoped
public class CuentaController implements Serializable {

    private Cuenta current;
    private DataModel items = null;
    @EJB
    private edu.co.sena.ejemplo1.negocio.ejbs.CuentaFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public CuentaController() {
    }

    public Cuenta getSelected() {
        if (current == null) {
            current = new Cuenta();
            current.setCuentaPK(new edu.co.sena.ejemplo1.integracion.entities.CuentaPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private CuentaFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (Cuenta) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Cuenta();
        current.setCuentaPK(new edu.co.sena.ejemplo1.integracion.entities.CuentaPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            current.getCuentaPK().setTipoDocumentotipodocumento(current.getTipoDocumento().getTipoDocumento());
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CuentaCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Cuenta) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            current.getCuentaPK().setTipoDocumentotipodocumento(current.getTipoDocumento().getTipoDocumento());
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CuentaUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Cuenta) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CuentaDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public Cuenta getCuenta(edu.co.sena.ejemplo1.integracion.entities.CuentaPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Cuenta.class)
    public static class CuentaControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CuentaController controller = (CuentaController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "cuentaController");
            return controller.getCuenta(getKey(value));
        }

        edu.co.sena.ejemplo1.integracion.entities.CuentaPK getKey(String value) {
            edu.co.sena.ejemplo1.integracion.entities.CuentaPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new edu.co.sena.ejemplo1.integracion.entities.CuentaPK();
            key.setTipoDocumentotipodocumento(values[0]);
            key.setNumeroDocumento(values[1]);
            return key;
        }

        String getStringKey(edu.co.sena.ejemplo1.integracion.entities.CuentaPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getTipoDocumentotipodocumento());
            sb.append(SEPARATOR);
            sb.append(value.getNumeroDocumento());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Cuenta) {
                Cuenta o = (Cuenta) object;
                return getStringKey(o.getCuentaPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Cuenta.class.getName());
            }
        }

    }

}
