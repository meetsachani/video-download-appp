package o;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: o.w21  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10369w21 implements InterfaceC10123v21 {
    public final LocaleList a;

    public C10369w21(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // o.InterfaceC10123v21
    public int a(Locale locale) {
        return this.a.indexOf(locale);
    }

    @Override // o.InterfaceC10123v21
    public String b() {
        return this.a.toLanguageTags();
    }

    @Override // o.InterfaceC10123v21
    public Object c() {
        return this.a;
    }

    @Override // o.InterfaceC10123v21
    public Locale d(String[] strArr) {
        return this.a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.a.equals(((InterfaceC10123v21) obj).c());
    }

    @Override // o.InterfaceC10123v21
    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // o.InterfaceC10123v21
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // o.InterfaceC10123v21
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
