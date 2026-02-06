package o;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: o.d01 */
/* loaded from: classes3.dex */
public class C5707d01 {
    public static final int b = 512;
    public static final int c = 3;
    public List<InterfaceC5222b01> a = new ArrayList();

    public static /* synthetic */ boolean a(String str, InterfaceC5222b01 interfaceC5222b01) {
        return interfaceC5222b01.a(str);
    }

    public void b(InterfaceC5222b01 interfaceC5222b01) {
        if (interfaceC5222b01 != null) {
            this.a.add(interfaceC5222b01);
        }
    }

    public boolean c(final String str) {
        return this.a.stream().allMatch(new Predicate() { // from class: o.c01
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C5707d01.a(str, (InterfaceC5222b01) obj);
            }
        });
    }

    public void d(List<InterfaceC5222b01> list) {
        this.a = list;
    }

    public void e(String str) throws C5817dS {
        if (!this.a.isEmpty()) {
            StringBuilder sb = null;
            for (InterfaceC5222b01 interfaceC5222b01 : this.a) {
                try {
                    interfaceC5222b01.b(str);
                } catch (C5817dS e) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((e.getMessage().length() + 2) * 3, 512));
                    }
                    sb.append(e.getMessage());
                    sb.append("\n");
                }
            }
            if (sb != null && sb.length() > 0) {
                throw new C5817dS(sb.toString());
            }
        }
    }
}
