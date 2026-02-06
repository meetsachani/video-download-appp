package o;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import o.DT1;
import org.json.JSONObject;

/* renamed from: o.tS1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9741tS1 {
    public static C9741tS1 c;
    public String a = "de_requesutls";
    public C9006qS1 b;

    /* renamed from: o.tS1$a */
    /* loaded from: classes3.dex */
    public class a implements DT1.b<String> {
        public final /* synthetic */ InterfaceC3208Hy1 X;

        public a(InterfaceC3208Hy1 interfaceC3208Hy1) {
            this.X = interfaceC3208Hy1;
        }

        @Override // o.DT1.b
        /* renamed from: a */
        public void b(String str) {
            boolean z;
            try {
                z = new JSONObject(str).getBoolean("status");
                String str2 = C9741tS1.this.a;
                Log.w(str2, "onResponse: " + z);
            } catch (Exception e) {
                e.printStackTrace();
                z = true;
            }
            Log.d("VolleyResponse", "Response: " + str);
            if (z) {
                try {
                    this.X.a(IS2.a(str));
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    this.X.b(e2.getMessage());
                    return;
                }
            }
            this.X.b("Not valid link or server error");
        }
    }

    /* renamed from: o.tS1$b */
    /* loaded from: classes3.dex */
    public class b implements DT1.a {
        public final /* synthetic */ InterfaceC3208Hy1 X;

        public b(InterfaceC3208Hy1 interfaceC3208Hy1) {
            this.X = interfaceC3208Hy1;
        }

        @Override // o.DT1.a
        public void a(C6524gJ2 c6524gJ2) {
            Log.e("VolleyError", "Error: " + c6524gJ2.toString());
            this.X.b(c6524gJ2.getMessage());
        }
    }

    /* renamed from: o.tS1$c */
    /* loaded from: classes3.dex */
    public class c extends C3231Ie2 {
        public final /* synthetic */ String p1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, String str, DT1.b bVar, DT1.a aVar, String str2) {
            super(i, str, bVar, aVar);
            this.p1 = str2;
        }

        @Override // o.AbstractC5091aS1
        public Map<String, String> w() {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.p1);
            return hashMap;
        }
    }

    public C9741tS1(Context context) {
        d(context);
    }

    public static C9741tS1 c(Context context) {
        if (c == null) {
            c = new C9741tS1(context);
        }
        return c;
    }

    public final void a(AbstractC5091aS1 abstractC5091aS1) {
        b(abstractC5091aS1);
        this.b.a(abstractC5091aS1);
    }

    public final void b(AbstractC5091aS1 abstractC5091aS1) {
        abstractC5091aS1.U(new C8406o00(15000, 1, 1.0f));
    }

    public void d(Context context) {
        this.b = C6269fJ2.a(context);
    }

    public void e(String str, InterfaceC3208Hy1 interfaceC3208Hy1) {
        String b2 = new C2918Fa().b(str);
        new JSONObject();
        f(b2, str, interfaceC3208Hy1);
    }

    public void f(String str, String str2, InterfaceC3208Hy1 interfaceC3208Hy1) {
        String str3 = this.a;
        Log.d(str3, "sendUrlAsFormData: " + str + " :url= " + str2);
        a(new c(1, str, new a(interfaceC3208Hy1), new b(interfaceC3208Hy1), str2));
    }
}
