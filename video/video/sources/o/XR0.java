package o;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.XR0;

/* loaded from: classes.dex */
public class XR0 {
    public static final String p = "IntentSanitizer";
    public int a;
    public LF1<String> b;
    public LF1<Uri> c;
    public LF1<String> d;
    public LF1<String> e;
    public LF1<String> f;
    public LF1<ComponentName> g;
    public boolean h;
    public Map<String, LF1<Object>> i;
    public boolean j;
    public LF1<Uri> k;
    public LF1<ClipData> l;
    public boolean m;
    public boolean n;

    /* renamed from: o */
    public boolean f660o;

    /* loaded from: classes.dex */
    public static class b {
        public static String a(Intent intent) {
            return intent.getIdentifier();
        }

        public static Intent b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(int i, ClipData.Item item, InterfaceC10929yL<String> interfaceC10929yL) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            interfaceC10929yL.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static final int q = 2112614400;
        public static final int r = 2015363072;
        public int a;
        public boolean h;
        public boolean i;
        public boolean n;

        /* renamed from: o */
        public boolean f661o;
        public boolean p;
        public LF1<String> b = new LF1() { // from class: o.iS0
            @Override // o.LF1
            public final boolean test(Object obj) {
                return XR0.d.p((String) obj);
            }
        };
        public LF1<Uri> c = new LF1() { // from class: o.jS0
            @Override // o.LF1
            public final boolean test(Object obj) {
                return XR0.d.l((Uri) obj);
            }
        };
        public LF1<String> d = new LF1() { // from class: o.kS0
            @Override // o.LF1
            public final boolean test(Object obj) {
                return XR0.d.b((String) obj);
            }
        };
        public LF1<String> e = new LF1() { // from class: o.lS0
            @Override // o.LF1
            public final boolean test(Object obj) {
                return XR0.d.k((String) obj);
            }
        };
        public LF1<String> f = new LF1() { // from class: o.mS0
            @Override // o.LF1
            public final boolean test(Object obj) {
                return XR0.d.f((String) obj);
            }
        };
        public LF1<ComponentName> g = new LF1() { // from class: o.nS0
            @Override // o.LF1
            public final boolean test(Object obj) {
                return XR0.d.a((ComponentName) obj);
            }
        };
        public Map<String, LF1<Object>> j = new HashMap();
        public boolean k = false;
        public LF1<Uri> l = new LF1() { // from class: o.oS0
            @Override // o.LF1
            public final boolean test(Object obj) {
                return XR0.d.m((Uri) obj);
            }
        };
        public LF1<ClipData> m = new LF1() { // from class: o.pS0
            @Override // o.LF1
            public final boolean test(Object obj) {
                return XR0.d.q((ClipData) obj);
            }
        };

        public static /* synthetic */ boolean a(ComponentName componentName) {
            return false;
        }

        public static /* synthetic */ boolean b(String str) {
            return false;
        }

        public static /* synthetic */ boolean c(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        public static /* synthetic */ boolean d(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean e(Class cls, LF1 lf1, Object obj) {
            if (cls.isInstance(obj) && lf1.test(cls.cast(obj))) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ boolean f(String str) {
            return false;
        }

        public static /* synthetic */ boolean g(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean h(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean i(Object obj) {
            return false;
        }

        public static /* synthetic */ boolean j(ComponentName componentName) {
            return true;
        }

        public static /* synthetic */ boolean k(String str) {
            return false;
        }

        public static /* synthetic */ boolean l(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean m(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean n(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean o(Object obj) {
            return true;
        }

        public static /* synthetic */ boolean p(String str) {
            return false;
        }

        public static /* synthetic */ boolean q(ClipData clipData) {
            return false;
        }

        public d A(final ComponentName componentName) {
            C10907yF1.l(componentName);
            Objects.requireNonNull(componentName);
            return B(new LF1() { // from class: o.dS0
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        public d B(LF1<ComponentName> lf1) {
            C10907yF1.l(lf1);
            this.i = true;
            this.g = this.g.k(lf1);
            return this;
        }

        public d C(final String str) {
            C10907yF1.l(str);
            return B(new LF1() { // from class: o.aS0
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return XR0.d.c(str, (ComponentName) obj);
                }
            });
        }

        public d D(LF1<Uri> lf1) {
            C10907yF1.l(lf1);
            this.c = this.c.k(lf1);
            return this;
        }

        public d E(final String str) {
            C10907yF1.l(str);
            D(new LF1() { // from class: o.bS0
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return XR0.d.n(str, (Uri) obj);
                }
            });
            return this;
        }

        public d F(String str, Class<?> cls) {
            return G(str, cls, new LF1() { // from class: o.qS0
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return XR0.d.o(obj);
                }
            });
        }

        public <T> d G(String str, final Class<T> cls, final LF1<T> lf1) {
            C10907yF1.l(str);
            C10907yF1.l(cls);
            C10907yF1.l(lf1);
            return H(str, new LF1() { // from class: o.cS0
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return XR0.d.e(cls, lf1, obj);
                }
            });
        }

        public d H(String str, LF1<Object> lf1) {
            C10907yF1.l(str);
            C10907yF1.l(lf1);
            LF1<Object> lf12 = this.j.get(str);
            if (lf12 == null) {
                lf12 = new LF1() { // from class: o.gS0
                    @Override // o.LF1
                    public final boolean test(Object obj) {
                        return XR0.d.i(obj);
                    }
                };
            }
            this.j.put(str, lf12.k(lf1));
            return this;
        }

        public d I(final String str) {
            G("output", Uri.class, new LF1() { // from class: o.YR0
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return XR0.d.g(str, (Uri) obj);
                }
            });
            return this;
        }

        public d J(LF1<Uri> lf1) {
            G("output", Uri.class, lf1);
            return this;
        }

        public d K(LF1<Uri> lf1) {
            G("android.intent.extra.STREAM", Uri.class, lf1);
            return this;
        }

        public d L(final String str) {
            C10907yF1.l(str);
            G("android.intent.extra.STREAM", Uri.class, new LF1() { // from class: o.hS0
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return XR0.d.h(str, (Uri) obj);
                }
            });
            return this;
        }

        public d M(int i) {
            this.a = i | this.a;
            return this;
        }

        public d N() {
            this.a |= q;
            return this;
        }

        public d O() {
            this.n = true;
            return this;
        }

        public d P(String str) {
            C10907yF1.l(str);
            Objects.requireNonNull(str);
            return Q(new ZR0(str));
        }

        public d Q(LF1<String> lf1) {
            C10907yF1.l(lf1);
            this.f = this.f.k(lf1);
            return this;
        }

        public d R() {
            this.a |= r;
            return this;
        }

        public d S() {
            this.f661o = true;
            return this;
        }

        public d T() {
            this.p = true;
            return this;
        }

        public d U(String str) {
            C10907yF1.l(str);
            Objects.requireNonNull(str);
            return V(new ZR0(str));
        }

        public d V(LF1<String> lf1) {
            C10907yF1.l(lf1);
            this.d = this.d.k(lf1);
            return this;
        }

        public XR0 W() {
            boolean z = this.h;
            if ((z && this.i) || (!z && !this.i)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            XR0 xr0 = new XR0();
            xr0.a = this.a;
            xr0.b = this.b;
            xr0.c = this.c;
            xr0.d = this.d;
            xr0.e = this.e;
            xr0.f = this.f;
            xr0.h = this.h;
            xr0.g = this.g;
            xr0.i = this.j;
            xr0.j = this.k;
            xr0.k = this.l;
            xr0.l = this.m;
            xr0.m = this.n;
            xr0.n = this.f661o;
            xr0.f660o = this.p;
            return xr0;
        }

        public d r(String str) {
            C10907yF1.l(str);
            Objects.requireNonNull(str);
            s(new ZR0(str));
            return this;
        }

        public d s(LF1<String> lf1) {
            C10907yF1.l(lf1);
            this.b = this.b.k(lf1);
            return this;
        }

        public d t() {
            this.h = true;
            this.g = new LF1() { // from class: o.eS0
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return XR0.d.j((ComponentName) obj);
                }
            };
            return this;
        }

        public d u(String str) {
            C10907yF1.l(str);
            Objects.requireNonNull(str);
            return v(new ZR0(str));
        }

        public d v(LF1<String> lf1) {
            C10907yF1.l(lf1);
            this.e = this.e.k(lf1);
            return this;
        }

        public d w(LF1<ClipData> lf1) {
            C10907yF1.l(lf1);
            this.m = this.m.k(lf1);
            return this;
        }

        public d x() {
            this.k = true;
            return this;
        }

        public d y(LF1<Uri> lf1) {
            C10907yF1.l(lf1);
            this.l = this.l.k(lf1);
            return this;
        }

        public d z(final String str) {
            C10907yF1.l(str);
            return y(new LF1() { // from class: o.fS0
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return XR0.d.d(str, (Uri) obj);
                }
            });
        }
    }

    public static /* synthetic */ void a(String str) {
        throw new SecurityException(str);
    }

    public static /* synthetic */ void b(String str) {
    }

    public static void r(int i, ClipData.Item item, InterfaceC10929yL<String> interfaceC10929yL) {
        if (item.getHtmlText() == null && item.getIntent() == null) {
            return;
        }
        interfaceC10929yL.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void w(Intent intent, Intent intent2, LF1<ClipData> lf1, boolean z, LF1<Uri> lf12, InterfaceC10929yL<String> interfaceC10929yL) {
        CharSequence charSequence;
        Uri uri;
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            if (lf1 != null && lf1.test(clipData)) {
                intent2.setClipData(clipData);
                return;
            }
            ClipData clipData2 = null;
            for (int i = 0; i < clipData.getItemCount(); i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (Build.VERSION.SDK_INT >= 31) {
                    c.a(i, itemAt, interfaceC10929yL);
                } else {
                    r(i, itemAt, interfaceC10929yL);
                }
                if (z) {
                    charSequence = itemAt.getText();
                } else {
                    if (itemAt.getText() != null) {
                        interfaceC10929yL.accept("Item text cannot contain value. Item position: " + i + ". Text: " + ((Object) itemAt.getText()));
                    }
                    charSequence = null;
                }
                if (lf12 == null) {
                    if (itemAt.getUri() != null) {
                        interfaceC10929yL.accept("Item URI is not allowed. Item position: " + i + ". URI: " + itemAt.getUri());
                    }
                } else if (itemAt.getUri() != null && !lf12.test(itemAt.getUri())) {
                    interfaceC10929yL.accept("Item URI is not allowed. Item position: " + i + ". URI: " + itemAt.getUri());
                } else {
                    uri = itemAt.getUri();
                    if (charSequence == null || uri != null) {
                        if (clipData2 != null) {
                            clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(charSequence, null, uri));
                        } else {
                            clipData2.addItem(new ClipData.Item(charSequence, null, uri));
                        }
                    }
                }
                uri = null;
                if (charSequence == null) {
                }
                if (clipData2 != null) {
                }
            }
            if (clipData2 != null) {
                intent2.setClipData(clipData2);
            }
        }
    }

    public final void s(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
        } else if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            intent.putExtra(str, (Serializable) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    public Intent t(Intent intent, InterfaceC10929yL<String> interfaceC10929yL) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.h && component == null) || this.g.test(component)) {
            intent2.setComponent(component);
        } else {
            interfaceC10929yL.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str != null && !this.f.test(str)) {
            interfaceC10929yL.accept("Package is not allowed: " + str);
        } else {
            intent2.setPackage(str);
        }
        int flags = this.a | intent.getFlags();
        int i = this.a;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            interfaceC10929yL.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.a)));
        }
        String action = intent.getAction();
        if (action != null && !this.b.test(action)) {
            interfaceC10929yL.accept("Action is not allowed: " + action);
        } else {
            intent2.setAction(action);
        }
        Uri data = intent.getData();
        if (data != null && !this.c.test(data)) {
            interfaceC10929yL.accept("Data is not allowed: " + data);
        } else {
            intent2.setData(data);
        }
        String type = intent.getType();
        if (type != null && !this.d.test(type)) {
            interfaceC10929yL.accept("Type is not allowed: " + type);
        } else {
            intent2.setDataAndType(intent2.getData(), type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    interfaceC10929yL.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.a & 1) == 0) {
                    interfaceC10929yL.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (str3.equals("output") && ((~this.a) & 3) != 0) {
                    interfaceC10929yL.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                } else {
                    Object obj = extras.get(str3);
                    LF1<Object> lf1 = this.i.get(str3);
                    if (lf1 != null && lf1.test(obj)) {
                        s(intent2, str3, obj);
                    } else {
                        interfaceC10929yL.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    }
                }
            }
        }
        w(intent, intent2, this.l, this.j, this.k, interfaceC10929yL);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.m) {
                b.b(intent2, b.a(intent));
            } else if (b.a(intent) != null) {
                interfaceC10929yL.accept("Identifier is not allowed: " + b.a(intent));
            }
        }
        if (this.n) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            interfaceC10929yL.accept("Selector is not allowed: " + intent.getSelector());
        }
        if (this.f660o) {
            intent2.setSourceBounds(intent.getSourceBounds());
            return intent2;
        }
        if (intent.getSourceBounds() != null) {
            interfaceC10929yL.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    public Intent u(Intent intent) {
        return t(intent, new InterfaceC10929yL() { // from class: o.WR0
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                XR0.b((String) obj);
            }
        });
    }

    public Intent v(Intent intent) {
        return t(intent, new InterfaceC10929yL() { // from class: o.VR0
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                XR0.a((String) obj);
            }
        });
    }

    public XR0() {
    }
}
