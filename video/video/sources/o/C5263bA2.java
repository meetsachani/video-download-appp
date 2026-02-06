package o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.bA2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5263bA2 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    public final List<String> X;

    public C5263bA2(InterfaceC3540Li1 interfaceC3540Li1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.X = null;
    }

    public static String b(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(C6566gU0.h);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public C9258rT0 a() {
        return new C9258rT0(getMessage());
    }

    public List<String> c() {
        return Collections.unmodifiableList(this.X);
    }

    public C5263bA2(List<String> list) {
        super(b(list));
        this.X = list;
    }
}
