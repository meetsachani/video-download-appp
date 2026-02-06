package o;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: o.tC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9677tC1 {
    public final Context a;
    public final C7033iP1 b;
    public final AbstractC5209ax1 c;
    public InterfaceC10929yL<CG2> d;
    public Executor e;
    public boolean f = false;
    public boolean g = false;

    public C9677tC1(Context context, C7033iP1 c7033iP1, AbstractC5209ax1 abstractC5209ax1) {
        this.a = CM.a(context);
        this.b = c7033iP1;
        this.c = abstractC5209ax1;
    }

    public C9677tC1 a() {
        this.g = true;
        return this;
    }

    public Context b() {
        return this.a;
    }

    public InterfaceC10929yL<CG2> c() {
        return this.d;
    }

    public Executor d() {
        return this.e;
    }

    public AbstractC5209ax1 e() {
        return this.c;
    }

    public C7033iP1 f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public C10215vP1 i(Executor executor, InterfaceC10929yL<CG2> interfaceC10929yL) {
        C10907yF1.m(executor, "Listener Executor can't be null.");
        C10907yF1.m(interfaceC10929yL, "Event listener can't be null");
        this.e = executor;
        this.d = interfaceC10929yL;
        return this.b.z0(this);
    }

    public C9677tC1 j() {
        if (EC1.d(this.a, "android.permission.RECORD_AUDIO") != -1) {
            C10907yF1.o(this.b.N(), "The Recorder this recording is associated to doesn't support audio.");
            this.f = true;
            return this;
        }
        throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
    }
}
