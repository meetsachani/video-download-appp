package o;

/* renamed from: o.mV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8044mV1 implements InterfaceC6776hM {
    public final String a;
    public final H9<Float, Float> b;

    public C8044mV1(String str, H9<Float, Float> h9) {
        this.a = str;
        this.b = h9;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new C8287nV1(c8431o61, abstractC8588ol, this);
    }

    public H9<Float, Float> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }
}
