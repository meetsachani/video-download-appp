package o;

import android.os.Bundle;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.S;

/* renamed from: o.Uh1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4414Uh1 implements S.b {
    public String a;
    public String b;
    public int c;
    @InterfaceC11300zs1
    public String d;
    public S.b e;

    public C4414Uh1(String title, String body, int timeInterval, @InterfaceC11300zs1 String payload, S.b callback) {
        this.a = title;
        this.b = body;
        this.c = timeInterval;
        this.d = payload;
        this.e = callback;
    }

    @Override // com.facebook.S.b
    public void a(com.facebook.Y response) {
        if (response.g() == null) {
            String optString = response.i().optString("id");
            C0376a k = C0376a.k();
            Bundle bundle = new Bundle();
            bundle.putString("title", this.a);
            bundle.putString("body", this.b);
            bundle.putInt(C9998uW1.c, this.c);
            String str = this.d;
            if (str != null) {
                bundle.putString(C9998uW1.d, str);
            }
            bundle.putString(C9998uW1.e, optString);
            new com.facebook.S(k, C9998uW1.h, bundle, com.facebook.Z.POST, this.e).n();
            return;
        }
        throw new C2416z(response.g().h());
    }
}
