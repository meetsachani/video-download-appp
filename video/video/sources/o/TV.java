package o;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HK1
/* loaded from: classes3.dex */
public final class TV implements Serializable {
    @Nullable
    public final Long X;
    @Nullable
    public final String Y;
    @NotNull
    public final String Y0;
    @Nullable
    public final String Z;
    @Nullable
    public final String Z0;
    @Nullable
    public final String a1;
    @NotNull
    public final List<StackTraceElement> b1;
    public final long c1;

    public TV(@NotNull CV cv, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        Long l;
        String str;
        String str2;
        String str3;
        Thread.State state;
        C8996qQ c8996qQ = (C8996qQ) interfaceC5809dQ.f(C8996qQ.Z);
        if (c8996qQ != null) {
            l = Long.valueOf(c8996qQ.V());
        } else {
            l = null;
        }
        this.X = l;
        LM lm = (LM) interfaceC5809dQ.f(LM.y);
        if (lm != null) {
            str = lm.toString();
        } else {
            str = null;
        }
        this.Y = str;
        C9245rQ c9245rQ = (C9245rQ) interfaceC5809dQ.f(C9245rQ.Z);
        if (c9245rQ != null) {
            str2 = c9245rQ.V();
        } else {
            str2 = null;
        }
        this.Z = str2;
        this.Y0 = cv.g();
        Thread thread = cv.lastObservedThread;
        if (thread != null && (state = thread.getState()) != null) {
            str3 = state.toString();
        } else {
            str3 = null;
        }
        this.Z0 = str3;
        Thread thread2 = cv.lastObservedThread;
        this.a1 = thread2 != null ? thread2.getName() : null;
        this.b1 = cv.h();
        this.c1 = cv.b;
    }

    @Nullable
    public final Long a() {
        return this.X;
    }

    @Nullable
    public final String b() {
        return this.Y;
    }

    @NotNull
    public final List<StackTraceElement> c() {
        return this.b1;
    }

    @Nullable
    public final String d() {
        return this.a1;
    }

    @Nullable
    public final String e() {
        return this.Z0;
    }

    @Nullable
    public final String f() {
        return this.Z;
    }

    public final long g() {
        return this.c1;
    }

    @NotNull
    public final String h() {
        return this.Y0;
    }
}
