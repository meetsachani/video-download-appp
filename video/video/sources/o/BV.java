package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HK1
/* loaded from: classes3.dex */
public final class BV {
    @NotNull
    public final InterfaceC5809dQ a;
    @Nullable
    public final InterfaceC10706xQ b;
    public final long c;
    @NotNull
    public final List<StackTraceElement> d;
    @NotNull
    public final String e;
    @Nullable
    public final Thread f;
    @Nullable
    public final InterfaceC10706xQ g;
    @NotNull
    public final List<StackTraceElement> h;

    public BV(@NotNull CV cv, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        this.a = interfaceC5809dQ;
        this.b = cv.d();
        this.c = cv.b;
        this.d = cv.e();
        this.e = cv.g();
        this.f = cv.lastObservedThread;
        this.g = cv.f();
        this.h = cv.h();
    }

    @NotNull
    public final InterfaceC5809dQ a() {
        return this.a;
    }

    @Nullable
    public final InterfaceC10706xQ b() {
        return this.b;
    }

    @NotNull
    public final List<StackTraceElement> c() {
        return this.d;
    }

    @Nullable
    public final InterfaceC10706xQ d() {
        return this.g;
    }

    @Nullable
    public final Thread e() {
        return this.f;
    }

    public final long f() {
        return this.c;
    }

    @NotNull
    public final String g() {
        return this.e;
    }

    @InterfaceC8046mW0(name = "lastObservedStackTrace")
    @NotNull
    public final List<StackTraceElement> h() {
        return this.h;
    }
}
