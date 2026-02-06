package o;

/* renamed from: o.Nb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3708Nb2 extends C3610Mb2 {
    @XP0
    public static final <R> R l(Object obj, FA0<? extends R> fa0) {
        R invoke;
        C6562gT0.p(obj, "lock");
        C6562gT0.p(fa0, "block");
        synchronized (obj) {
            try {
                invoke = fa0.invoke();
                UP0.d(1);
            } catch (Throwable th) {
                UP0.d(1);
                UP0.c(1);
                throw th;
            }
        }
        UP0.c(1);
        return invoke;
    }
}
