package o;

import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class Cz2 implements EJ0 {
    public final /* synthetic */ Consumer b;

    public /* synthetic */ Cz2(Consumer consumer) {
        this.b = consumer;
    }

    @Override // o.EJ0
    public final void accept(Object obj) {
        this.b.accept(obj);
    }
}
