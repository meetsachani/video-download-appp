package o;

/* renamed from: o.mU1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8041mU1 {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i, TInput tinput, WA0<TInput, TResult, TException> wa0, InterfaceC8771pU1<TInput, TResult> interfaceC8771pU1) throws Throwable {
        TResult apply;
        if (i < 1) {
            return wa0.apply(tinput);
        }
        do {
            apply = wa0.apply(tinput);
            tinput = interfaceC8771pU1.a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
