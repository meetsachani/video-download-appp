package o;

import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.sm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9570sm<T, I> extends V<T, I> {
    public final Pattern g;
    public final Pattern h;
    public final String i;
    public final String j;
    public final Class<? extends Collection> k;
    public final Class<?> l;

    public C9570sm(Class<?> cls, Field field, boolean z, Locale locale, ER er, String str, String str2, Class<? extends Collection> cls2, Class<?> cls3, String str3, String str4) {
        super(cls, field, z, locale, er);
        this.i = str2;
        this.j = str4;
        this.l = cls3;
        if (Collection.class.isAssignableFrom(field.getType())) {
            this.g = C3297Iv1.b(str, 0, C9570sm.class, this.d);
            this.h = C3297Iv1.c(str3, 0, C9570sm.class, this.d);
            C3297Iv1.g(str4, C9570sm.class, this.d);
            Class<?> type = field.getType();
            if (!type.isInterface()) {
                this.k = field.getType();
            } else if (!cls2.isInterface()) {
                this.k = cls2;
            } else if (!Collection.class.equals(type) && !List.class.equals(type)) {
                if (Set.class.equals(type)) {
                    if (type.isEnum()) {
                        this.k = EnumSet.class;
                    } else {
                        this.k = HashSet.class;
                    }
                } else if (!SortedSet.class.equals(type) && !NavigableSet.class.equals(type)) {
                    if (!Queue.class.equals(type) && !Deque.class.equals(type)) {
                        if (InterfaceC2958Fk.class.equals(type)) {
                            this.k = C7480kG0.class;
                        } else if (U92.class.equals(type)) {
                            this.k = C5198au2.class;
                        } else {
                            this.k = null;
                            throw new C8027mR(C9570sm.class, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("invalid.collection.type"), cls2.toString()));
                        }
                    } else {
                        this.k = ArrayDeque.class;
                    }
                } else {
                    this.k = TreeSet.class;
                }
            } else {
                this.k = ArrayList.class;
            }
            if (!field.getType().isAssignableFrom(this.k)) {
                throw new C8027mR(C9570sm.class, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("unassignable.collection.type"), cls2.getName(), field.getType().getName()));
            }
            return;
        }
        throw new C8027mR(C9570sm.class, String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("invalid.collection.type"), field.getType().toString()));
    }

    @Override // o.V
    public Object b(String str) throws JR, DR {
        Collection newInstance;
        String[] split;
        try {
            if (this.k.equals(EnumSet.class)) {
                newInstance = EnumSet.noneOf(this.l);
            } else {
                newInstance = this.k.newInstance();
            }
            if (str == null) {
                split = C4206Se.u;
            } else {
                split = this.g.split(str);
            }
            for (String str2 : split) {
                Pattern pattern = this.h;
                if (pattern != null) {
                    Matcher matcher = pattern.matcher(str2);
                    if (matcher.matches()) {
                        str2 = matcher.group(1);
                    }
                }
                newInstance.add(this.e.a(str2));
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            e = e;
            C8270nR c8270nR = new C8270nR(String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("collection.cannot.be.instantiated"), this.k.getCanonicalName()));
            c8270nR.initCause(e);
            throw c8270nR;
        } catch (InstantiationException e2) {
            e = e2;
            C8270nR c8270nR2 = new C8270nR(String.format(ResourceBundle.getBundle(UI0.k, this.d).getString("collection.cannot.be.instantiated"), this.k.getCanonicalName()));
            c8270nR2.initCause(e);
            throw c8270nR2;
        }
    }

    @Override // o.V
    public String c(Object obj) throws JR {
        if (obj != null) {
            Collection<Object> collection = (Collection) obj;
            String[] strArr = new String[collection.size()];
            int i = 0;
            for (Object obj2 : collection) {
                strArr[i] = this.e.b(obj2);
                if (C4500Ve2.N0(this.j) && C4500Ve2.N0(strArr[i])) {
                    strArr[i] = String.format(this.j, strArr[i]);
                }
                i++;
            }
            return C4500Ve2.m1(strArr, this.i);
        }
        return "";
    }

    @Override // o.V
    public boolean o(Object obj) {
        if (!super.o(obj) && !((Collection) obj).isEmpty()) {
            return false;
        }
        return true;
    }
}
