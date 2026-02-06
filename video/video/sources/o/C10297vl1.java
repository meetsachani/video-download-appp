package o;

import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.vl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10297vl1<E> extends AbstractC8896q1<E> implements RandomAccess {
    public int Y0;
    @NotNull
    public final List<E> Z;
    public int Z0;

    /* JADX WARN: Multi-variable type inference failed */
    public C10297vl1(@NotNull List<? extends E> list) {
        C6562gT0.p(list, "list");
        this.Z = list;
    }

    @Override // o.AbstractC8896q1, o.AbstractC7901m0
    public int e() {
        return this.Z0;
    }

    @Override // o.AbstractC8896q1, java.util.List
    public E get(int i) {
        AbstractC8896q1.X.b(i, this.Z0);
        return this.Z.get(this.Y0 + i);
    }

    public final void h(int i, int i2) {
        AbstractC8896q1.X.d(i, i2, this.Z.size());
        this.Y0 = i;
        this.Z0 = i2 - i;
    }
}
