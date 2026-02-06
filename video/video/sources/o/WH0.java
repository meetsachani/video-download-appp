package o;

import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class WH0 implements InterfaceC4651Ws0<WH0> {
    public final String a;
    public final List<String> b;
    public final boolean c;

    public WH0(String str, List<String> list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
