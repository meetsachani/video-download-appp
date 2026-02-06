package o;

/* renamed from: o.eM0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6036eM0 {
    public static IllegalArgumentException a(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    public static IllegalArgumentException b(Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr), th);
    }
}
