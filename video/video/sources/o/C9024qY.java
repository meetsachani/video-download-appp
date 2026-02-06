package o;

import android.content.Context;
import o.InterfaceC6027eK;

/* renamed from: o.qY  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9024qY implements InterfaceC6027eK {
    public final Context X;
    public final InterfaceC6027eK.a Y;

    public C9024qY(Context context, InterfaceC6027eK.a aVar) {
        this.X = context.getApplicationContext();
        this.Y = aVar;
    }

    public final void a() {
        A82.a(this.X).d(this.Y);
    }

    public final void b() {
        A82.a(this.X).f(this.Y);
    }

    @Override // o.IZ0
    public void onStart() {
        a();
    }

    @Override // o.IZ0
    public void onStop() {
        b();
    }

    @Override // o.IZ0
    public void onDestroy() {
    }
}
