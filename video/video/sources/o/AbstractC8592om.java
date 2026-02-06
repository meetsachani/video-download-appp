package o;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: o.om  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8592om<T, I> extends C9327rm<T, I> {
    public final Class<? extends InterfaceC7846lm1> i;

    public AbstractC8592om(Class<?> cls, Field field, boolean z, Locale locale, ER er, Class<? extends InterfaceC7846lm1> cls2, String str, String str2) {
        super(cls, field, z, locale, er, str, str2);
        if (InterfaceC7846lm1.class.isAssignableFrom(field.getType())) {
            Class<?> type = field.getType();
            if (!type.isInterface()) {
                this.i = field.getType();
            } else if (!cls2.isInterface()) {
                this.i = cls2;
            } else if (!InterfaceC7846lm1.class.equals(type) && !InterfaceC7664l11.class.equals(type)) {
                if (InterfaceC10613x22.class.equals(type)) {
                    this.i = C10667xG0.class;
                } else {
                    this.i = null;
                    throw new C8027mR(AbstractC8592om.class, String.format(ResourceBundle.getBundle(UI0.k, locale).getString("invalid.multivaluedmap.type"), cls2.toString()));
                }
            } else {
                this.i = C11242ze.class;
            }
            if (field.getType().isAssignableFrom(this.i)) {
                return;
            }
            throw new C8027mR(AbstractC8592om.class, String.format(ResourceBundle.getBundle(UI0.k, locale).getString("unassignable.multivaluedmap.type"), cls2.getName(), field.getType().getName()));
        }
        throw new C8027mR(AbstractC8592om.class, String.format(ResourceBundle.getBundle(UI0.k, locale).getString("invalid.multivaluedmap.type"), field.getType().toString()));
    }

    @Override // o.V
    public void a(Object obj, Object obj2, String str) throws JR {
        InterfaceC7846lm1 interfaceC7846lm1 = (InterfaceC7846lm1) m(obj);
        if (interfaceC7846lm1 == null) {
            try {
                interfaceC7846lm1 = this.i.getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                e = e;
                C8270nR c8270nR = new C8270nR(obj, this.b, e.getLocalizedMessage());
                c8270nR.initCause(e);
                throw c8270nR;
            } catch (IllegalAccessException e2) {
                e = e2;
                C8270nR c8270nR2 = new C8270nR(obj, this.b, e.getLocalizedMessage());
                c8270nR2.initCause(e);
                throw c8270nR2;
            } catch (InstantiationException e3) {
                e = e3;
                C8027mR c8027mR = new C8027mR(AbstractC8592om.class, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("map.cannot.be.instantiated"), this.i.getName()));
                c8027mR.initCause(e);
                throw c8027mR;
            } catch (NoSuchMethodException e4) {
                e = e4;
                C8027mR c8027mR2 = new C8027mR(AbstractC8592om.class, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("map.cannot.be.instantiated"), this.i.getName()));
                c8027mR2.initCause(e);
                throw c8027mR2;
            } catch (InvocationTargetException e5) {
                e = e5;
                C8270nR c8270nR22 = new C8270nR(obj, this.b, e.getLocalizedMessage());
                c8270nR22.initCause(e);
                throw c8270nR22;
            }
        }
        r(interfaceC7846lm1, str, obj2);
        super.a(obj, interfaceC7846lm1, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.V, o.InterfaceC8348nm
    public Object[] k(Object obj, I i) throws JR {
        Object[] objArr = C4206Se.r;
        if (obj != null) {
            if (InterfaceC7846lm1.class.isAssignableFrom(obj.getClass())) {
                return ((InterfaceC7846lm1) obj).get(i).toArray(objArr);
            }
            throw new JR(obj, String.class, ResourceBundle.getBundle(UI0.k, this.d).getString("field.not.multivaluedmap"));
        }
        return objArr;
    }

    @Override // o.V
    public boolean o(Object obj) {
        if (!super.o(obj) && !((InterfaceC7846lm1) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public abstract Object r(InterfaceC7846lm1<I, Object> interfaceC7846lm1, String str, Object obj);
}
