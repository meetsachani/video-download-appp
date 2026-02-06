package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public class SY implements InterfaceC7331jf0, Serializable {
    private static final long serialVersionUID = 20110706;
    public final List<AbstractC4280Sx1<String, Object>> X = new ArrayList();

    public static /* synthetic */ boolean h(String str, AbstractC4280Sx1 abstractC4280Sx1) {
        return C4500Ve2.T(str, (CharSequence) abstractC4280Sx1.getKey());
    }

    @Override // o.InterfaceC7331jf0
    public Set<String> a() {
        HashSet hashSet = new HashSet();
        for (AbstractC4280Sx1<String, Object> abstractC4280Sx1 : this.X) {
            hashSet.add(abstractC4280Sx1.getKey());
        }
        return hashSet;
    }

    @Override // o.InterfaceC7331jf0
    public List<AbstractC4280Sx1<String, Object>> b() {
        return this.X;
    }

    @Override // o.InterfaceC7331jf0
    public String c(String str) {
        String str2;
        StringBuilder sb = new StringBuilder(256);
        if (str != null) {
            sb.append(str);
        }
        if (!this.X.isEmpty()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Exception Context:\n");
            int i = 0;
            for (AbstractC4280Sx1<String, Object> abstractC4280Sx1 : this.X) {
                sb.append("\t[");
                i++;
                sb.append(i);
                sb.append(':');
                sb.append(abstractC4280Sx1.getKey());
                sb.append("=");
                Object value = abstractC4280Sx1.getValue();
                if (value == null) {
                    sb.append("null");
                } else {
                    try {
                        str2 = value.toString();
                    } catch (Exception e) {
                        str2 = "Exception thrown on toString(): " + C10761xf0.l(e);
                    }
                    sb.append(str2);
                }
                sb.append("]\n");
            }
            sb.append("---------------------------------");
        }
        return sb.toString();
    }

    @Override // o.InterfaceC7331jf0
    public Object d(String str) {
        for (AbstractC4280Sx1<String, Object> abstractC4280Sx1 : this.X) {
            if (C4500Ve2.T(str, abstractC4280Sx1.getKey())) {
                return abstractC4280Sx1.getValue();
            }
        }
        return null;
    }

    @Override // o.InterfaceC7331jf0
    public List<Object> f(String str) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC4280Sx1<String, Object> abstractC4280Sx1 : this.X) {
            if (C4500Ve2.T(str, abstractC4280Sx1.getKey())) {
                arrayList.add(abstractC4280Sx1.getValue());
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC7331jf0
    /* renamed from: i */
    public SY e(String str, Object obj) {
        this.X.add(new C8746pO0(str, obj));
        return this;
    }

    @Override // o.InterfaceC7331jf0
    /* renamed from: j */
    public SY g(final String str, Object obj) {
        this.X.removeIf(new Predicate() { // from class: o.RY
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return SY.h(str, (AbstractC4280Sx1) obj2);
            }
        });
        e(str, obj);
        return this;
    }
}
