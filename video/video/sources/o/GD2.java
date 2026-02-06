package o;

import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class GD2 extends ThreadLocal {
    public final /* synthetic */ Supplier a;

    @Override // java.lang.ThreadLocal
    public /* synthetic */ Object initialValue() {
        return this.a.get();
    }
}
