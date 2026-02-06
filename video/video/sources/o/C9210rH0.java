package o;

import java.util.ArrayList;
import java.util.Collections;
import o.C8068mc2;

/* renamed from: o.rH0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9210rH0 extends QK implements InterfaceC5156ak0 {
    public final C8068mc2 m0;
    public final C8068mc2.d n0;
    public ArrayList<Object> o0;
    public C9696tH0 p0;

    public C9210rH0(C8068mc2 c8068mc2, C8068mc2.d dVar) {
        super(c8068mc2);
        this.o0 = new ArrayList<>();
        this.m0 = c8068mc2;
        this.n0 = dVar;
    }

    public C9210rH0 P0(Object... objArr) {
        Collections.addAll(this.o0, objArr);
        return this;
    }

    public void Q0() {
        super.apply();
    }

    public C9696tH0 R0() {
        return this.p0;
    }

    public C8068mc2.d S0() {
        return this.n0;
    }

    public void T0(C9696tH0 c9696tH0) {
        this.p0 = c9696tH0;
    }

    @Override // o.QK, o.TP1
    public UK a() {
        return R0();
    }

    @Override // o.QK, o.TP1
    public void apply() {
    }
}
