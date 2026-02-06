package o;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.C0376a;
import com.facebook.InterfaceC2411u;
import com.facebook.internal.AbstractC2368m;
import com.facebook.internal.C2357b;
import com.facebook.internal.C2361f;
import com.facebook.internal.C2364i;
import com.facebook.internal.C2367l;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: o.xC0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10651xC0 extends AbstractC2368m<C10408wC0, d> {
    public static final String i = "apprequests";
    public static final int j = C2361f.c.GameRequest.g();

    /* renamed from: o.xC0$a */
    /* loaded from: classes2.dex */
    public class a extends WT1 {
        public final /* synthetic */ InterfaceC2411u b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2411u appCallback, final InterfaceC2411u val$callback) {
            super(appCallback);
            this.b = val$callback;
        }

        @Override // o.WT1
        public void c(C2357b appCall, Bundle results) {
            if (results != null) {
                this.b.a(new d(results, null));
            } else {
                a(appCall);
            }
        }
    }

    /* renamed from: o.xC0$b */
    /* loaded from: classes2.dex */
    public class b implements C2361f.a {
        public final /* synthetic */ WT1 a;

        public b(final WT1 val$resultProcessor) {
            this.a = val$resultProcessor;
        }

        @Override // com.facebook.internal.C2361f.a
        public boolean a(int resultCode, Intent data) {
            return D32.q(C10651xC0.this.q(), resultCode, data, this.a);
        }
    }

    /* renamed from: o.xC0$c */
    /* loaded from: classes2.dex */
    public class c extends AbstractC2368m<C10408wC0, d>.b {
        public c() {
            super(C10651xC0.this);
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(final C10408wC0 content, boolean isBestEffort) {
            if (C2364i.a() != null && com.facebook.internal.m0.h(C10651xC0.this.n(), C2364i.b())) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: f */
        public C2357b b(final C10408wC0 content) {
            C10894yC0.a(content);
            C2357b m = C10651xC0.this.m();
            Bundle b = MJ2.b(content);
            C0376a k = C0376a.k();
            if (k != null) {
                b.putString("app_id", k.h());
            } else {
                b.putString("app_id", com.facebook.M.o());
            }
            b.putString(com.facebook.internal.c0.w, C2364i.b());
            C2367l.l(m, "apprequests", b);
            return m;
        }

        public /* synthetic */ c(C10651xC0 c10651xC0, a aVar) {
            this();
        }
    }

    /* renamed from: o.xC0$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public String a;
        public List<String> b;

        public /* synthetic */ d(Bundle bundle, a aVar) {
            this(bundle);
        }

        public String a() {
            return this.a;
        }

        public List<String> b() {
            return this.b;
        }

        public d(Bundle results) {
            this.a = results.getString("request");
            this.b = new ArrayList();
            while (results.containsKey(String.format(C9642t32.w, Integer.valueOf(this.b.size())))) {
                List<String> list = this.b;
                list.add(results.getString(String.format(C9642t32.w, Integer.valueOf(list.size()))));
            }
        }
    }

    /* renamed from: o.xC0$e */
    /* loaded from: classes2.dex */
    public class e extends AbstractC2368m<C10408wC0, d>.b {
        public e() {
            super(C10651xC0.this);
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(final C10408wC0 content, boolean isBestEffort) {
            return true;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: f */
        public C2357b b(final C10408wC0 content) {
            C10894yC0.a(content);
            C2357b m = C10651xC0.this.m();
            C2367l.p(m, "apprequests", MJ2.b(content));
            return m;
        }

        public /* synthetic */ e(C10651xC0 c10651xC0, a aVar) {
            this();
        }
    }

    public C10651xC0(Activity activity) {
        super(activity, j);
    }

    public static void A(final Activity activity, final C10408wC0 gameRequestContent) {
        new C10651xC0(activity).f(gameRequestContent);
    }

    public static void B(final Fragment fragment, final C10408wC0 gameRequestContent) {
        D(new com.facebook.internal.I(fragment), gameRequestContent);
    }

    public static void C(final androidx.fragment.app.Fragment fragment, final C10408wC0 gameRequestContent) {
        D(new com.facebook.internal.I(fragment), gameRequestContent);
    }

    private static void D(final com.facebook.internal.I fragmentWrapper, final C10408wC0 gameRequestContent) {
        new C10651xC0(fragmentWrapper).f(gameRequestContent);
    }

    public static boolean z() {
        return true;
    }

    @Override // com.facebook.internal.AbstractC2368m
    public C2357b m() {
        return new C2357b(q());
    }

    @Override // com.facebook.internal.AbstractC2368m
    public List<AbstractC2368m<C10408wC0, d>.b> p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(this, null));
        arrayList.add(new e(this, null));
        return arrayList;
    }

    @Override // com.facebook.internal.AbstractC2368m
    public void s(final C2361f callbackManager, final InterfaceC2411u<d> callback) {
        a aVar;
        if (callback == null) {
            aVar = null;
        } else {
            aVar = new a(callback, callback);
        }
        callbackManager.b(q(), new b(aVar));
    }

    public C10651xC0(androidx.fragment.app.Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
    }

    public C10651xC0(Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
    }

    public C10651xC0(com.facebook.internal.I fragmentWrapper) {
        super(fragmentWrapper, j);
    }
}
