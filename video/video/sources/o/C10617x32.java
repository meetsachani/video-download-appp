package o;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0376a;
import com.facebook.InterfaceC2411u;
import com.facebook.appevents.K;
import com.facebook.internal.AbstractC2368m;
import com.facebook.internal.C2356a;
import com.facebook.internal.C2357b;
import com.facebook.internal.C2361f;
import com.facebook.internal.C2367l;
import com.facebook.internal.InterfaceC2365j;
import com.facebook.internal.X;
import com.facebook.share.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import o.L32;
import o.M32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.x32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10617x32 extends AbstractC2368m<AbstractC9885u32<?, ?>, e.a> implements com.facebook.share.e {
    @NotNull
    public static final String n = "feed";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f907o = "share";
    @NotNull
    public static final String p = "share_open_graph";
    public boolean i;
    public boolean j;
    @NotNull
    public final List<AbstractC2368m<AbstractC9885u32<?, ?>, e.a>.b> k;
    @NotNull
    public static final b l = new b(null);
    public static final String m = C10617x32.class.getSimpleName();
    public static final int q = C2361f.c.Share.g();

    /* renamed from: o.x32$a */
    /* loaded from: classes2.dex */
    public final class a extends AbstractC2368m<AbstractC9885u32<?, ?>, e.a>.b {
        @NotNull
        public Object c;
        public final /* synthetic */ C10617x32 d;

        /* renamed from: o.x32$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0354a implements C2367l.a {
            public final /* synthetic */ C2357b a;
            public final /* synthetic */ AbstractC9885u32<?, ?> b;
            public final /* synthetic */ boolean c;

            public C0354a(C2357b c2357b, AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
                this.a = c2357b;
                this.b = abstractC9885u32;
                this.c = z;
            }

            @Override // com.facebook.internal.C2367l.a
            @Nullable
            public Bundle a() {
                C8298nZ0 c8298nZ0 = C8298nZ0.a;
                return C8298nZ0.a(this.a.d(), this.b, this.c);
            }

            @Override // com.facebook.internal.C2367l.a
            @Nullable
            public Bundle getParameters() {
                C2475Ao1 c2475Ao1 = C2475Ao1.a;
                return C2475Ao1.a(this.a.d(), this.b, this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C10617x32 c10617x32) {
            super(c10617x32);
            C6562gT0.p(c10617x32, "this$0");
            this.d = c10617x32;
            this.c = d.NATIVE;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        public Object c() {
            return this.c;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        public void d(@NotNull Object obj) {
            C6562gT0.p(obj, "<set-?>");
            this.c = obj;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@NotNull AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
            C6562gT0.p(abstractC9885u32, "content");
            if ((abstractC9885u32 instanceof C9156r32) && C10617x32.l.e(abstractC9885u32.getClass())) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @Nullable
        /* renamed from: f */
        public C2357b b(@NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
            C6562gT0.p(abstractC9885u32, "content");
            C10128v32 c10128v32 = C10128v32.a;
            C10128v32.o(abstractC9885u32);
            C2357b m = this.d.m();
            boolean e = this.d.e();
            InterfaceC2365j h = C10617x32.l.h(abstractC9885u32.getClass());
            if (h == null) {
                return null;
            }
            C2367l c2367l = C2367l.a;
            C2367l.n(m, new C0354a(m, abstractC9885u32, e), h);
            return m;
        }
    }

    /* renamed from: o.x32$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public boolean d(@NotNull Class<? extends AbstractC9885u32<?, ?>> cls) {
            C6562gT0.p(cls, "contentType");
            if (!g(cls) && !e(cls)) {
                return false;
            }
            return true;
        }

        public final boolean e(Class<? extends AbstractC9885u32<?, ?>> cls) {
            InterfaceC2365j h = h(cls);
            if (h != null) {
                C2367l c2367l = C2367l.a;
                if (C2367l.b(h)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean f(AbstractC9885u32<?, ?> abstractC9885u32) {
            if (!g(abstractC9885u32.getClass())) {
                return false;
            }
            return true;
        }

        public final boolean g(Class<? extends AbstractC9885u32<?, ?>> cls) {
            if (!E32.class.isAssignableFrom(cls)) {
                if (!M32.class.isAssignableFrom(cls) || !C0376a.g1.k()) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public final InterfaceC2365j h(Class<? extends AbstractC9885u32<?, ?>> cls) {
            if (E32.class.isAssignableFrom(cls)) {
                return EnumC10860y32.SHARE_DIALOG;
            }
            if (M32.class.isAssignableFrom(cls)) {
                return EnumC10860y32.PHOTOS;
            }
            if (S32.class.isAssignableFrom(cls)) {
                return EnumC10860y32.VIDEO;
            }
            if (G32.class.isAssignableFrom(cls)) {
                return EnumC10860y32.MULTIMEDIA;
            }
            if (C9156r32.class.isAssignableFrom(cls)) {
                return EnumC4275Sw.SHARE_CAMERA_EFFECT;
            }
            if (O32.class.isAssignableFrom(cls)) {
                return P32.SHARE_STORY_ASSET;
            }
            return null;
        }

        @InterfaceC9511sW0
        public void i(@NotNull Activity activity, @NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            C6562gT0.p(abstractC9885u32, "shareContent");
            new C10617x32(activity).f(abstractC9885u32);
        }

        @InterfaceC9511sW0
        public void j(@NotNull Fragment fragment, @NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
            C6562gT0.p(fragment, "fragment");
            C6562gT0.p(abstractC9885u32, "shareContent");
            l(new com.facebook.internal.I(fragment), abstractC9885u32);
        }

        @InterfaceC9511sW0
        public void k(@NotNull androidx.fragment.app.Fragment fragment, @NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
            C6562gT0.p(fragment, "fragment");
            C6562gT0.p(abstractC9885u32, "shareContent");
            l(new com.facebook.internal.I(fragment), abstractC9885u32);
        }

        public final void l(com.facebook.internal.I i, AbstractC9885u32<?, ?> abstractC9885u32) {
            new C10617x32(i, 0, 2, null).f(abstractC9885u32);
        }

        public b() {
        }
    }

    /* renamed from: o.x32$c */
    /* loaded from: classes2.dex */
    public final class c extends AbstractC2368m<AbstractC9885u32<?, ?>, e.a>.b {
        @NotNull
        public Object c;
        public final /* synthetic */ C10617x32 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C10617x32 c10617x32) {
            super(c10617x32);
            C6562gT0.p(c10617x32, "this$0");
            this.d = c10617x32;
            this.c = d.FEED;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        public Object c() {
            return this.c;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        public void d(@NotNull Object obj) {
            C6562gT0.p(obj, "<set-?>");
            this.c = obj;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@NotNull AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
            C6562gT0.p(abstractC9885u32, "content");
            if (!(abstractC9885u32 instanceof E32) && !(abstractC9885u32 instanceof C11103z32)) {
                return false;
            }
            return true;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @Nullable
        /* renamed from: f */
        public C2357b b(@NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
            Bundle f;
            C6562gT0.p(abstractC9885u32, "content");
            C10617x32 c10617x32 = this.d;
            c10617x32.C(c10617x32.n(), abstractC9885u32, d.FEED);
            C2357b m = this.d.m();
            if (abstractC9885u32 instanceof E32) {
                C10128v32 c10128v32 = C10128v32.a;
                C10128v32.q(abstractC9885u32);
                MJ2 mj2 = MJ2.a;
                f = MJ2.g((E32) abstractC9885u32);
            } else if (abstractC9885u32 instanceof C11103z32) {
                MJ2 mj22 = MJ2.a;
                f = MJ2.f((C11103z32) abstractC9885u32);
            } else {
                return null;
            }
            C2367l c2367l = C2367l.a;
            C2367l.p(m, C10617x32.n, f);
            return m;
        }
    }

    /* renamed from: o.x32$d */
    /* loaded from: classes2.dex */
    public enum d {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: o.x32$e */
    /* loaded from: classes2.dex */
    public final class e extends AbstractC2368m<AbstractC9885u32<?, ?>, e.a>.b {
        @NotNull
        public Object c;
        public final /* synthetic */ C10617x32 d;

        /* renamed from: o.x32$e$a */
        /* loaded from: classes2.dex */
        public static final class a implements C2367l.a {
            public final /* synthetic */ C2357b a;
            public final /* synthetic */ AbstractC9885u32<?, ?> b;
            public final /* synthetic */ boolean c;

            public a(C2357b c2357b, AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
                this.a = c2357b;
                this.b = abstractC9885u32;
                this.c = z;
            }

            @Override // com.facebook.internal.C2367l.a
            @Nullable
            public Bundle a() {
                C8298nZ0 c8298nZ0 = C8298nZ0.a;
                return C8298nZ0.a(this.a.d(), this.b, this.c);
            }

            @Override // com.facebook.internal.C2367l.a
            @Nullable
            public Bundle getParameters() {
                C2475Ao1 c2475Ao1 = C2475Ao1.a;
                return C2475Ao1.a(this.a.d(), this.b, this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C10617x32 c10617x32) {
            super(c10617x32);
            C6562gT0.p(c10617x32, "this$0");
            this.d = c10617x32;
            this.c = d.NATIVE;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        public Object c() {
            return this.c;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        public void d(@NotNull Object obj) {
            C6562gT0.p(obj, "<set-?>");
            this.c = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
            if (com.facebook.internal.C2367l.b(o.EnumC10860y32.b1) != false) goto L26;
         */
        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(@NotNull AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
            boolean z2;
            String h;
            C6562gT0.p(abstractC9885u32, "content");
            if (!(abstractC9885u32 instanceof C9156r32) && !(abstractC9885u32 instanceof O32)) {
                if (!z) {
                    if (abstractC9885u32.f() != null) {
                        C2367l c2367l = C2367l.a;
                        z2 = C2367l.b(EnumC10860y32.HASHTAG);
                    } else {
                        z2 = true;
                    }
                    if ((abstractC9885u32 instanceof E32) && (h = ((E32) abstractC9885u32).h()) != null && h.length() != 0) {
                        if (z2) {
                            C2367l c2367l2 = C2367l.a;
                        }
                        z2 = false;
                    }
                    if (!z2 && C10617x32.l.e(abstractC9885u32.getClass())) {
                        return true;
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
            return false;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @Nullable
        /* renamed from: f */
        public C2357b b(@NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
            C6562gT0.p(abstractC9885u32, "content");
            C10617x32 c10617x32 = this.d;
            c10617x32.C(c10617x32.n(), abstractC9885u32, d.NATIVE);
            C10128v32 c10128v32 = C10128v32.a;
            C10128v32.o(abstractC9885u32);
            C2357b m = this.d.m();
            boolean e = this.d.e();
            InterfaceC2365j h = C10617x32.l.h(abstractC9885u32.getClass());
            if (h == null) {
                return null;
            }
            C2367l c2367l = C2367l.a;
            C2367l.n(m, new a(m, abstractC9885u32, e), h);
            return m;
        }
    }

    /* renamed from: o.x32$f */
    /* loaded from: classes2.dex */
    public final class f extends AbstractC2368m<AbstractC9885u32<?, ?>, e.a>.b {
        @NotNull
        public Object c;
        public final /* synthetic */ C10617x32 d;

        /* renamed from: o.x32$f$a */
        /* loaded from: classes2.dex */
        public static final class a implements C2367l.a {
            public final /* synthetic */ C2357b a;
            public final /* synthetic */ AbstractC9885u32<?, ?> b;
            public final /* synthetic */ boolean c;

            public a(C2357b c2357b, AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
                this.a = c2357b;
                this.b = abstractC9885u32;
                this.c = z;
            }

            @Override // com.facebook.internal.C2367l.a
            @Nullable
            public Bundle a() {
                C8298nZ0 c8298nZ0 = C8298nZ0.a;
                return C8298nZ0.a(this.a.d(), this.b, this.c);
            }

            @Override // com.facebook.internal.C2367l.a
            @Nullable
            public Bundle getParameters() {
                C2475Ao1 c2475Ao1 = C2475Ao1.a;
                return C2475Ao1.a(this.a.d(), this.b, this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C10617x32 c10617x32) {
            super(c10617x32);
            C6562gT0.p(c10617x32, "this$0");
            this.d = c10617x32;
            this.c = d.NATIVE;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        public Object c() {
            return this.c;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        public void d(@NotNull Object obj) {
            C6562gT0.p(obj, "<set-?>");
            this.c = obj;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@NotNull AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
            C6562gT0.p(abstractC9885u32, "content");
            if ((abstractC9885u32 instanceof O32) && C10617x32.l.e(abstractC9885u32.getClass())) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @Nullable
        /* renamed from: f */
        public C2357b b(@NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
            C6562gT0.p(abstractC9885u32, "content");
            C10128v32 c10128v32 = C10128v32.a;
            C10128v32.p(abstractC9885u32);
            C2357b m = this.d.m();
            boolean e = this.d.e();
            InterfaceC2365j h = C10617x32.l.h(abstractC9885u32.getClass());
            if (h == null) {
                return null;
            }
            C2367l c2367l = C2367l.a;
            C2367l.n(m, new a(m, abstractC9885u32, e), h);
            return m;
        }
    }

    /* renamed from: o.x32$g */
    /* loaded from: classes2.dex */
    public final class g extends AbstractC2368m<AbstractC9885u32<?, ?>, e.a>.b {
        @NotNull
        public Object c;
        public final /* synthetic */ C10617x32 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C10617x32 c10617x32) {
            super(c10617x32);
            C6562gT0.p(c10617x32, "this$0");
            this.d = c10617x32;
            this.c = d.WEB;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        public Object c() {
            return this.c;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        public void d(@NotNull Object obj) {
            C6562gT0.p(obj, "<set-?>");
            this.c = obj;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@NotNull AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
            C6562gT0.p(abstractC9885u32, "content");
            return C10617x32.l.f(abstractC9885u32);
        }

        public final M32 f(M32 m32, UUID uuid) {
            M32.a h = new M32.a().h(m32);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = m32.h().size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    L32 l32 = m32.h().get(i);
                    Bitmap d = l32.d();
                    if (d != null) {
                        com.facebook.internal.X x = com.facebook.internal.X.a;
                        X.a d2 = com.facebook.internal.X.d(uuid, d);
                        l32 = new L32.a().c(l32).r(Uri.parse(d2.b())).p(null).build();
                        arrayList2.add(d2);
                    }
                    arrayList.add(l32);
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            h.z(arrayList);
            com.facebook.internal.X x2 = com.facebook.internal.X.a;
            com.facebook.internal.X.a(arrayList2);
            return h.build();
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @Nullable
        /* renamed from: g */
        public C2357b b(@NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
            Bundle d;
            C6562gT0.p(abstractC9885u32, "content");
            C10617x32 c10617x32 = this.d;
            c10617x32.C(c10617x32.n(), abstractC9885u32, d.WEB);
            C2357b m = this.d.m();
            C10128v32 c10128v32 = C10128v32.a;
            C10128v32.q(abstractC9885u32);
            if (abstractC9885u32 instanceof E32) {
                MJ2 mj2 = MJ2.a;
                d = MJ2.c((E32) abstractC9885u32);
            } else if (abstractC9885u32 instanceof M32) {
                M32 f = f((M32) abstractC9885u32, m.d());
                MJ2 mj22 = MJ2.a;
                d = MJ2.d(f);
            } else {
                return null;
            }
            C2367l c2367l = C2367l.a;
            C2367l.p(m, h(abstractC9885u32), d);
            return m;
        }

        public final String h(AbstractC9885u32<?, ?> abstractC9885u32) {
            if (!(abstractC9885u32 instanceof E32) && !(abstractC9885u32 instanceof M32)) {
                return null;
            }
            return "share";
        }
    }

    /* renamed from: o.x32$h */
    /* loaded from: classes2.dex */
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.AUTOMATIC.ordinal()] = 1;
            iArr[d.WEB.ordinal()] = 2;
            iArr[d.NATIVE.ordinal()] = 3;
            a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10617x32(@NotNull Activity activity) {
        this(activity, q);
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    @InterfaceC9511sW0
    public static boolean A(@NotNull Class<? extends AbstractC9885u32<?, ?>> cls) {
        return l.d(cls);
    }

    @InterfaceC9511sW0
    public static void D(@NotNull Activity activity, @NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
        l.i(activity, abstractC9885u32);
    }

    @InterfaceC9511sW0
    public static void E(@NotNull Fragment fragment, @NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
        l.j(fragment, abstractC9885u32);
    }

    @InterfaceC9511sW0
    public static void F(@NotNull androidx.fragment.app.Fragment fragment, @NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
        l.k(fragment, abstractC9885u32);
    }

    public boolean B(@NotNull AbstractC9885u32<?, ?> abstractC9885u32, @NotNull d dVar) {
        C6562gT0.p(abstractC9885u32, "content");
        C6562gT0.p(dVar, "mode");
        d dVar2 = dVar;
        if (dVar == d.AUTOMATIC) {
            dVar2 = AbstractC2368m.h;
        }
        return j(abstractC9885u32, dVar2);
    }

    public final void C(Context context, AbstractC9885u32<?, ?> abstractC9885u32, d dVar) {
        String str;
        if (this.j) {
            dVar = d.AUTOMATIC;
        }
        int i = h.a[dVar.ordinal()];
        String str2 = "unknown";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "unknown";
                } else {
                    str = "native";
                }
            } else {
                str = "web";
            }
        } else {
            str = C2356a.c0;
        }
        InterfaceC2365j h2 = l.h(abstractC9885u32.getClass());
        if (h2 == EnumC10860y32.SHARE_DIALOG) {
            str2 = "status";
        } else if (h2 == EnumC10860y32.PHOTOS) {
            str2 = C2356a.i0;
        } else if (h2 == EnumC10860y32.VIDEO) {
            str2 = "video";
        }
        K.a aVar = com.facebook.appevents.K.b;
        com.facebook.M m2 = com.facebook.M.a;
        com.facebook.appevents.K b2 = aVar.b(context, com.facebook.M.o());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString(C2356a.e0, str2);
        b2.m("fb_share_dialog_show", bundle);
    }

    public void G(@NotNull AbstractC9885u32<?, ?> abstractC9885u32, @NotNull d dVar) {
        boolean z;
        C6562gT0.p(abstractC9885u32, "content");
        C6562gT0.p(dVar, "mode");
        if (dVar == d.AUTOMATIC) {
            z = true;
        } else {
            z = false;
        }
        this.j = z;
        d dVar2 = dVar;
        if (z) {
            dVar2 = AbstractC2368m.h;
        }
        w(abstractC9885u32, dVar2);
    }

    public void a(boolean z) {
        this.i = z;
    }

    public boolean e() {
        return this.i;
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public C2357b m() {
        return new C2357b(q(), null, 2, null);
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public List<AbstractC2368m<AbstractC9885u32<?, ?>, e.a>.b> p() {
        return this.k;
    }

    @Override // com.facebook.internal.AbstractC2368m
    public void s(@NotNull C2361f c2361f, @NotNull InterfaceC2411u<e.a> interfaceC2411u) {
        C6562gT0.p(c2361f, "callbackManager");
        C6562gT0.p(interfaceC2411u, "callback");
        D32 d32 = D32.a;
        D32.D(q(), c2361f, interfaceC2411u);
    }

    public C10617x32(int i) {
        super(i);
        this.j = true;
        this.k = C8222nF.s(new e(this), new c(this), new g(this), new a(this), new f(this));
        D32 d32 = D32.a;
        D32.F(i);
    }

    public /* synthetic */ C10617x32(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? q : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10617x32(@NotNull androidx.fragment.app.Fragment fragment) {
        this(new com.facebook.internal.I(fragment), 0, 2, null);
        C6562gT0.p(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10617x32(@NotNull Fragment fragment) {
        this(new com.facebook.internal.I(fragment), 0, 2, null);
        C6562gT0.p(fragment, "fragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10617x32(@NotNull Activity activity, int i) {
        super(activity, i);
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        this.j = true;
        this.k = C8222nF.s(new e(this), new c(this), new g(this), new a(this), new f(this));
        D32 d32 = D32.a;
        D32.F(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10617x32(@NotNull androidx.fragment.app.Fragment fragment, int i) {
        this(new com.facebook.internal.I(fragment), i);
        C6562gT0.p(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10617x32(@NotNull Fragment fragment, int i) {
        this(new com.facebook.internal.I(fragment), i);
        C6562gT0.p(fragment, "fragment");
    }

    public /* synthetic */ C10617x32(com.facebook.internal.I i, int i2, int i3, C9516sY c9516sY) {
        this(i, (i3 & 2) != 0 ? q : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10617x32(@NotNull com.facebook.internal.I i, int i2) {
        super(i, i2);
        C6562gT0.p(i, "fragmentWrapper");
        this.j = true;
        this.k = C8222nF.s(new e(this), new c(this), new g(this), new a(this), new f(this));
        D32 d32 = D32.a;
        D32.F(i2);
    }
}
