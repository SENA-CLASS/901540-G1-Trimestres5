package edu.co.sena.ceetregistro.presentacion.managerbeans.log;

import edu.co.sena.ceetregistro.integracion.entitites.log.LogAplicacion;
import edu.co.sena.ceetregistro.presentacion.managerbeans.log.util.JsfUtil;
import edu.co.sena.ceetregistro.presentacion.managerbeans.log.util.JsfUtil.PersistAction;
import edu.co.sena.ceetregistro.negocio.ejbs.log.LogAplicacionFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("logAplicacionController")
@SessionScoped
public class LogAplicacionController implements Serializable {

    @EJB
    private edu.co.sena.ceetregistro.negocio.ejbs.log.LogAplicacionFacade ejbFacade;
    private List<LogAplicacion> items = null;
    private LogAplicacion selected;

    public LogAplicacionController() {
    }

    public LogAplicacion getSelected() {
        return selected;
    }

    public void setSelected(LogAplicacion selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private LogAplicacionFacade getFacade() {
        return ejbFacade;
    }

    public LogAplicacion prepareCreate() {
        selected = new LogAplicacion();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/BundleLog").getString("LogAplicacionCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/BundleLog").getString("LogAplicacionUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/BundleLog").getString("LogAplicacionDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<LogAplicacion> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/BundleLog").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/BundleLog").getString("PersistenceErrorOccured"));
            }
        }
    }

    public LogAplicacion getLogAplicacion(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<LogAplicacion> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<LogAplicacion> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = LogAplicacion.class)
    public static class LogAplicacionControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            LogAplicacionController controller = (LogAplicacionController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "logAplicacionController");
            return controller.getLogAplicacion(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof LogAplicacion) {
                LogAplicacion o = (LogAplicacion) object;
                return getStringKey(o.getIdlogAplicacion());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), LogAplicacion.class.getName()});
                return null;
            }
        }

    }

}
