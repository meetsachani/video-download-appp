package o;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import com.facebook.InterfaceC2411u;
import com.facebook.internal.AbstractC2368m;
import com.facebook.internal.C2356a;
import com.facebook.internal.C2357b;
import com.facebook.internal.C2361f;
import com.facebook.internal.C2367l;
import com.facebook.internal.InterfaceC2365j;
import com.facebook.share.e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Ei1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2843Ei1 extends C10617x32 implements com.facebook.share.e {
    public static final int s = C2361f.c.Message.g();
    public boolean r;

    /* renamed from: o.Ei1$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractC2368m<AbstractC9885u32<?, ?>, e.a>.b {

        /* renamed from: o.Ei1$b$a */
        /* loaded from: classes2.dex */
        public class a implements C2367l.a {
            public final /* synthetic */ C2357b a;
            public final /* synthetic */ AbstractC9885u32 b;
            public final /* synthetic */ boolean c;

            public a(final C2357b val$appCall, final AbstractC9885u32 val$content, final boolean val$shouldFailOnDataError) {
                this.a = val$appCall;
                this.b = val$content;
                this.c = val$shouldFailOnDataError;
            }

            @Override // com.facebook.internal.C2367l.a
            public Bundle a() {
                return C8298nZ0.a(this.a.d(), this.b, this.c);
            }

            @Override // com.facebook.internal.C2367l.a
            public Bundle getParameters() {
                return C2475Ao1.a(this.a.d(), this.b, this.c);
            }
        }

        public b() {
            super(C2843Ei1.this);
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(final AbstractC9885u32 shareContent, boolean isBestEffort) {
            if (shareContent != null && C2843Ei1.A(shareContent.getClass())) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: f */
        public C2357b b(final AbstractC9885u32 content) {
            C10128v32.n(content);
            C2357b m = C2843Ei1.this.m();
            boolean e = C2843Ei1.this.e();
            C2843Ei1.L(C2843Ei1.this.n(), content, m);
            C2367l.n(m, new a(m, content, e), C2843Ei1.K(content.getClass()));
            return m;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2843Ei1(Activity activity) {
        super(activity, r0);
        int i = s;
        this.r = false;
        D32.F(i);
    }

    public static boolean A(Class<? extends AbstractC9885u32<?, ?>> contentType) {
        InterfaceC2365j K = K(contentType);
        if (K != null && C2367l.b(K)) {
            return true;
        }
        return false;
    }

    public static void D(final Activity activity, final AbstractC9885u32 shareContent) {
        new C2843Ei1(activity).f(shareContent);
    }

    public static void E(final Fragment fragment, final AbstractC9885u32 shareContent) {
        M(new com.facebook.internal.I(fragment), shareContent);
    }

    public static void F(final androidx.fragment.app.Fragment fragment, final AbstractC9885u32 shareContent) {
        M(new com.facebook.internal.I(fragment), shareContent);
    }

    public static InterfaceC2365j K(Class<? extends AbstractC9885u32> type) {
        if (E32.class.isAssignableFrom(type)) {
            return EnumC2952Fi1.MESSAGE_DIALOG;
        }
        return null;
    }

    public static void L(Context context, AbstractC9885u32 content, C2357b appCall) {
        String str;
        InterfaceC2365j K = K(content.getClass());
        if (K == EnumC2952Fi1.MESSAGE_DIALOG) {
            str = "status";
        } else if (K == EnumC2952Fi1.MESSENGER_GENERIC_TEMPLATE) {
            str = C2356a.A0;
        } else if (K == EnumC2952Fi1.MESSENGER_MEDIA_TEMPLATE) {
            str = C2356a.B0;
        } else {
            str = "unknown";
        }
        com.facebook.appevents.K k = new com.facebook.appevents.K(context);
        Bundle bundle = new Bundle();
        bundle.putString(C2356a.e0, str);
        bundle.putString(C2356a.f0, appCall.d().toString());
        bundle.putString(C2356a.g0, content.b());
        k.m(C2356a.n0, bundle);
    }

    public static void M(final com.facebook.internal.I fragmentWrapper, final AbstractC9885u32 shareContent) {
        new C2843Ei1(fragmentWrapper).f(shareContent);
    }

    @Override // o.C10617x32, com.facebook.share.e
    public void a(boolean shouldFailOnDataError) {
        this.r = shouldFailOnDataError;
    }

    @Override // o.C10617x32, com.facebook.share.e
    public boolean e() {
        return this.r;
    }

    @Override // o.C10617x32, com.facebook.internal.AbstractC2368m
    public C2357b m() {
        return new C2357b(q());
    }

    @Override // o.C10617x32, com.facebook.internal.AbstractC2368m
    public List<AbstractC2368m<AbstractC9885u32<?, ?>, e.a>.b> p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        return arrayList;
    }

    @Override // o.C10617x32, com.facebook.internal.AbstractC2368m
    public void s(final C2361f callbackManager, final InterfaceC2411u<e.a> callback) {
        D32.D(q(), callbackManager, callback);
    }

    public C2843Ei1(androidx.fragment.app.Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
    }

    public C2843Ei1(Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2843Ei1(com.facebook.internal.I fragmentWrapper) {
        super(fragmentWrapper, r0);
        int i = s;
        this.r = false;
        D32.F(i);
    }

    public C2843Ei1(Activity activity, int requestCode) {
        super(activity, requestCode);
        this.r = false;
        D32.F(requestCode);
    }

    public C2843Ei1(androidx.fragment.app.Fragment fragment, int requestCode) {
        this(new com.facebook.internal.I(fragment), requestCode);
    }

    public C2843Ei1(Fragment fragment, int requestCode) {
        this(new com.facebook.internal.I(fragment), requestCode);
    }

    public C2843Ei1(com.facebook.internal.I fragmentWrapper, int requestCode) {
        super(fragmentWrapper, requestCode);
        this.r = false;
        D32.F(requestCode);
    }
}
