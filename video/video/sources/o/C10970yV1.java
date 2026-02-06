package o;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: o.yV1 */
/* loaded from: classes3.dex */
public class C10970yV1 {
    public static final int b = 512;
    public static final int c = 3;
    public List<InterfaceC10484wV1> a = new ArrayList();

    public static /* synthetic */ boolean a(String[] strArr, InterfaceC10484wV1 interfaceC10484wV1) {
        return interfaceC10484wV1.a(strArr);
    }

    public void b(InterfaceC10484wV1 interfaceC10484wV1) {
        if (interfaceC10484wV1 != null) {
            this.a.add(interfaceC10484wV1);
        }
    }

    public boolean c(final String[] strArr) {
        return this.a.stream().allMatch(new Predicate() { // from class: o.xV1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C10970yV1.a(strArr, (InterfaceC10484wV1) obj);
            }
        });
    }

    public void d(List<InterfaceC10484wV1> list) {
        this.a = list;
    }

    public void e(String[] strArr) throws C5817dS {
        if (!this.a.isEmpty()) {
            StringBuilder sb = null;
            for (InterfaceC10484wV1 interfaceC10484wV1 : this.a) {
                try {
                    interfaceC10484wV1.b(strArr);
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
