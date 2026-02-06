package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.OL1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.th2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9796th2 extends MenuInflater {
    public static final String e = "SupportMenuInflater";
    public static final String f = "menu";
    public static final String g = "group";
    public static final String h = "item";
    public static final int i = 0;
    public static final Class<?>[] j;
    public static final Class<?>[] k;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;

    /* renamed from: o.th2$a */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public Object a;
        public Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: o.th2$b */
    /* loaded from: classes.dex */
    public class b {
        public static final int G = 0;
        public static final int H = 0;
        public static final int I = 0;
        public static final int J = 0;
        public static final int K = 0;
        public static final boolean L = false;
        public static final boolean M = true;
        public static final boolean N = true;
        public U4 A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public Menu a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;

        /* renamed from: o  reason: collision with root package name */
        public int f877o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        public void a() {
            this.h = true;
            i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C9796th2.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(C9796th2.e, "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C9796th2.this.c.obtainStyledAttributes(attributeSet, OL1.m.d4);
            this.b = obtainStyledAttributes.getResourceId(OL1.m.f4, 0);
            this.c = obtainStyledAttributes.getInt(OL1.m.h4, 0);
            this.d = obtainStyledAttributes.getInt(OL1.m.i4, 0);
            this.e = obtainStyledAttributes.getInt(OL1.m.j4, 0);
            this.f = obtainStyledAttributes.getBoolean(OL1.m.g4, true);
            this.g = obtainStyledAttributes.getBoolean(OL1.m.e4, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            boolean z;
            C2872Ep2 F = C2872Ep2.F(C9796th2.this.c, attributeSet, OL1.m.k4);
            this.i = F.u(OL1.m.n4, 0);
            this.j = (F.o(OL1.m.q4, this.c) & InterfaceMenuC9553sh2.c) | (F.o(OL1.m.r4, this.d) & 65535);
            this.k = F.x(OL1.m.s4);
            this.l = F.x(OL1.m.t4);
            this.m = F.u(OL1.m.l4, 0);
            this.n = c(F.w(OL1.m.u4));
            this.f877o = F.o(OL1.m.B4, 4096);
            this.p = c(F.w(OL1.m.v4));
            this.q = F.o(OL1.m.F4, 4096);
            int i = OL1.m.w4;
            if (F.C(i)) {
                this.r = F.a(i, false) ? 1 : 0;
            } else {
                this.r = this.e;
            }
            this.s = F.a(OL1.m.o4, false);
            this.t = F.a(OL1.m.p4, this.f);
            this.u = F.a(OL1.m.m4, this.g);
            this.v = F.o(OL1.m.G4, -1);
            this.z = F.w(OL1.m.x4);
            this.w = F.u(OL1.m.y4, 0);
            this.x = F.w(OL1.m.A4);
            String w = F.w(OL1.m.z4);
            this.y = w;
            if (w != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.w == 0 && this.x == null) {
                this.A = (U4) e(w, C9796th2.k, C9796th2.this.b);
            } else {
                if (z) {
                    Log.w(C9796th2.e, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = F.x(OL1.m.C4);
            this.C = F.x(OL1.m.H4);
            int i2 = OL1.m.E4;
            if (F.C(i2)) {
                this.E = X60.e(F.o(i2, -1), this.E);
            } else {
                this.E = null;
            }
            int i3 = OL1.m.D4;
            if (F.C(i3)) {
                this.D = F.d(i3);
            } else {
                this.D = null;
            }
            F.I();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            boolean z2 = false;
            if (this.r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (!C9796th2.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(C9796th2.this.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    ((androidx.appcompat.view.menu.h) menuItem).w(true);
                } else if (menuItem instanceof MenuItemC9064qi1) {
                    ((MenuItemC9064qi1) menuItem).j(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, C9796th2.j, C9796th2.this.a));
                z2 = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (!z2) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w(C9796th2.e, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            U4 u4 = this.A;
            if (u4 != null) {
                C8578oi1.l(menuItem, u4);
            }
            C8578oi1.p(menuItem, this.B);
            C8578oi1.w(menuItem, this.C);
            C8578oi1.o(menuItem, this.n, this.f877o);
            C8578oi1.s(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                C8578oi1.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                C8578oi1.q(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        j = clsArr;
        k = clsArr;
    }

    public C9796th2(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    public Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.b() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals(o.C9796th2.f) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals(o.C9796th2.f) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(f)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof InterfaceMenuC9553sh2)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.I()) {
                        eVar.n0();
                        z = true;
                    }
                }
                c(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((androidx.appcompat.view.menu.e) menu).m0();
                }
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((androidx.appcompat.view.menu.e) menu).m0();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
