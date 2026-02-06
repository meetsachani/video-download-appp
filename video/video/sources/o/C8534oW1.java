package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.oW1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8534oW1 {

    /* renamed from: o.oW1$a */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ FA0<C7458kA2> X;

        public a(FA0<C7458kA2> fa0) {
            this.X = fa0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X.invoke();
        }
    }

    @NotNull
    public static final Runnable a(@NotNull FA0<C7458kA2> fa0) {
        return new a(fa0);
    }
}
