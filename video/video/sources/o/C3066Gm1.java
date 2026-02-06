package o;

import java.util.ResourceBundle;

/* renamed from: o.Gm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3066Gm1 implements InterfaceC4791Ye2 {
    public String a = "";

    @Override // o.InterfaceC4791Ye2
    public boolean a(String str) {
        if (this.a.isEmpty()) {
            return true;
        }
        return str.matches(this.a);
    }

    @Override // o.InterfaceC4791Ye2
    public void b(String str) {
        if (str != null && !str.isEmpty()) {
            this.a = str;
        }
    }

    @Override // o.InterfaceC4791Ye2
    public void c(String str, InterfaceC8348nm interfaceC8348nm) throws C5817dS {
        if (a(str)) {
            return;
        }
        throw new C5817dS(String.format(ResourceBundle.getBundle("mustMatchRegex", interfaceC8348nm.n()).getString("validator.regex.mismatch"), interfaceC8348nm.i().getName(), str, this.a));
    }
}
