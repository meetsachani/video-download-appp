package o;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class V22 implements InterfaceC6776hM {
    public final String a;
    public final List<InterfaceC6776hM> b;
    public final boolean c;

    public V22(String str, List<InterfaceC6776hM> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new HL(c8431o61, abstractC8588ol, this, c10624x51);
    }

    public List<InterfaceC6776hM> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
