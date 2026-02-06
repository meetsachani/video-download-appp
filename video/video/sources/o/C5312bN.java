package o;

/* renamed from: o.bN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5312bN implements InterfaceC3133He2 {
    public String a;

    @Override // o.InterfaceC3133He2
    public void b(String str) {
        this.a = str;
    }

    @Override // o.InterfaceC3133He2
    public String c(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return str;
        }
        return this.a;
    }
}
