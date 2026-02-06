package o;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.ge  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6599ge extends AbstractC9141r0 {
    public final Class<?> f;
    public final InterfaceC7507kN g;
    public int h;
    public char i;
    public char[] j;
    public boolean k;

    public C6599ge(Class<?> cls, InterfaceC7507kN interfaceC7507kN) {
        this.i = ',';
        this.j = new char[]{'.', '-'};
        this.k = true;
        if (cls != null) {
            if (!cls.isArray()) {
                throw new IllegalArgumentException("Default type must be an array.");
            }
            if (interfaceC7507kN != null) {
                this.f = cls;
                this.g = interfaceC7507kN;
                return;
            }
            throw new IllegalArgumentException("Component Converter is missing.");
        }
        throw new IllegalArgumentException("Default type is missing");
    }

    @Override // o.AbstractC9141r0
    public String f(Object obj) throws Throwable {
        Iterator<?> it;
        int i;
        Object next;
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            i = Array.getLength(obj);
            it = null;
        } else {
            Collection<?> p = p(cls, obj);
            int size = p.size();
            it = p.iterator();
            i = size;
        }
        if (i == 0) {
            return (String) h(String.class);
        }
        if (this.k) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(this.i);
            }
            if (it == null) {
                next = Array.get(obj, i2);
            } else {
                next = it.next();
            }
            Object b = this.g.b(String.class, next);
            if (b != null) {
                sb.append(b);
            }
        }
        return sb.toString();
    }

    @Override // o.AbstractC9141r0
    public <T> T g(Class<T> cls, Object obj) throws Throwable {
        Iterator<?> it;
        int i;
        Object next;
        if (cls.isArray()) {
            if (obj.getClass().isArray()) {
                i = Array.getLength(obj);
                it = null;
            } else {
                Collection<?> p = p(cls, obj);
                int size = p.size();
                it = p.iterator();
                i = size;
            }
            Class<?> componentType = cls.getComponentType();
            T t = (T) Array.newInstance(componentType, i);
            for (int i2 = 0; i2 < i; i2++) {
                if (it == null) {
                    next = Array.get(obj, i2);
                } else {
                    next = it.next();
                }
                Array.set(t, i2, this.g.b(componentType, next));
            }
            return t;
        }
        throw new WM(o(getClass()) + " cannot handle conversion to '" + o(cls) + "' (not an array).");
    }

    @Override // o.AbstractC9141r0
    public Object h(Class<?> cls) {
        Object h;
        if (cls.equals(String.class) || (h = super.h(cls)) == null) {
            return null;
        }
        if (h.getClass().equals(cls)) {
            return h;
        }
        return Array.newInstance(cls.getComponentType(), this.h);
    }

    @Override // o.AbstractC9141r0
    public Class<?> i() {
        return this.f;
    }

    public Collection<?> p(Class<?> cls, Object obj) {
        if (obj instanceof Collection) {
            return (Collection) obj;
        }
        if (!(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Date)) {
            return q(cls, obj.toString());
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(obj);
        return arrayList;
    }

    public final List<String> q(Class<?> cls, String str) {
        char[] cArr;
        int nextToken;
        if (m().c()) {
            m().a("Parsing elements, delimiter=[" + this.i + "], value=[" + str + C6566gU0.g);
        }
        String trim = str.trim();
        if (trim.startsWith("{") && trim.endsWith("}")) {
            trim = trim.substring(1, trim.length() - 1);
        }
        try {
            StreamTokenizer streamTokenizer = new StreamTokenizer(new StringReader(trim));
            char c = this.i;
            streamTokenizer.whitespaceChars(c, c);
            streamTokenizer.ordinaryChars(48, 57);
            streamTokenizer.wordChars(48, 57);
            for (char c2 : this.j) {
                streamTokenizer.ordinaryChars(c2, c2);
                streamTokenizer.wordChars(c2, c2);
            }
            List<String> list = null;
            while (true) {
                nextToken = streamTokenizer.nextToken();
                if (nextToken != -3 && nextToken <= 0) {
                    break;
                }
                if (streamTokenizer.sval != null) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(streamTokenizer.sval);
                }
            }
            if (nextToken == -1) {
                if (list == null) {
                    list = Collections.EMPTY_LIST;
                }
                if (m().c()) {
                    m().a(list.size() + " elements parsed");
                }
                return list;
            }
            throw new WM("Encountered token of type " + nextToken + " parsing elements to '" + o(cls) + UE.h);
        } catch (IOException e) {
            throw new WM("Error converting from String to '" + o(cls) + "': " + e.getMessage(), e);
        }
    }

    public void r(char[] cArr) {
        this.j = cArr;
    }

    public void s(char c) {
        this.i = c;
    }

    public void t(boolean z) {
        this.k = z;
    }

    @Override // o.AbstractC9141r0
    public String toString() {
        return o(getClass()) + "[UseDefault=" + l() + C6566gU0.h + this.g.toString() + ']';
    }

    public C6599ge(Class<?> cls, InterfaceC7507kN interfaceC7507kN, int i) {
        this(cls, interfaceC7507kN);
        this.h = i;
        n(i >= 0 ? Array.newInstance(cls.getComponentType(), i) : null);
    }

    @Override // o.AbstractC9141r0
    public Object d(Object obj) {
        return obj;
    }
}
