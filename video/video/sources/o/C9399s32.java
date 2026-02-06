package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import java.util.ArrayList;

/* renamed from: o.s32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9399s32 {
    public static final String a = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    public static final String c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String e = ".sharecompat_";

    /* renamed from: o.s32$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Context a;
        public final Intent b;
        public CharSequence c;
        public ArrayList<String> d;
        public ArrayList<String> e;
        public ArrayList<String> f;
        public ArrayList<Uri> g;

        public a(Context context) {
            Activity activity;
            this.a = (Context) C10907yF1.l(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.b = action;
            action.putExtra(C9399s32.a, context.getPackageName());
            action.putExtra(C9399s32.b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.b.putExtra(C9399s32.c, componentName);
                this.b.putExtra(C9399s32.d, componentName);
            }
        }

        @Deprecated
        public static a k(Activity activity) {
            return new a(activity);
        }

        public a a(String str) {
            if (this.f == null) {
                this.f = new ArrayList<>();
            }
            this.f.add(str);
            return this;
        }

        public a b(String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        public a c(String str) {
            if (this.e == null) {
                this.e = new ArrayList<>();
            }
            this.e.add(str);
            return this;
        }

        public a d(String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        public a e(String str) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(str);
            return this;
        }

        public a f(String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public a g(Uri uri) {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            this.g.add(uri);
            return this;
        }

        public final void h(String str, ArrayList<String> arrayList) {
            int i;
            String[] stringArrayExtra = this.b.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                i = stringArrayExtra.length;
            } else {
                i = 0;
            }
            String[] strArr = new String[arrayList.size() + i];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), i);
            }
            this.b.putExtra(str, strArr);
        }

        public final void i(String str, String[] strArr) {
            int i;
            Intent m = m();
            String[] stringArrayExtra = m.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                i = stringArrayExtra.length;
            } else {
                i = 0;
            }
            String[] strArr2 = new String[strArr.length + i];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, i);
            }
            System.arraycopy(strArr, 0, strArr2, i, strArr.length);
            m.putExtra(str, strArr2);
        }

        public Intent j() {
            return Intent.createChooser(m(), this.c);
        }

        public Context l() {
            return this.a;
        }

        public Intent m() {
            ArrayList<String> arrayList = this.d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.d = null;
            }
            ArrayList<String> arrayList2 = this.e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.e = null;
            }
            ArrayList<String> arrayList3 = this.f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f = null;
            }
            ArrayList<Uri> arrayList4 = this.g;
            if (arrayList4 != null && arrayList4.size() > 1) {
                this.b.setAction("android.intent.action.SEND_MULTIPLE");
                this.b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.g);
                C9399s32.g(this.b, this.g);
            } else {
                this.b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.g;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    this.b.putExtra("android.intent.extra.STREAM", this.g.get(0));
                    C9399s32.g(this.b, this.g);
                } else {
                    this.b.removeExtra("android.intent.extra.STREAM");
                    this.b.setClipData(null);
                    Intent intent = this.b;
                    intent.setFlags(intent.getFlags() & (-2));
                }
            }
            return this.b;
        }

        public a n(int i) {
            return o(this.a.getText(i));
        }

        public a o(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public a p(String[] strArr) {
            this.b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        public a q(String[] strArr) {
            this.b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        public a r(String[] strArr) {
            if (this.d != null) {
                this.d = null;
            }
            this.b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public a s(String str) {
            this.b.putExtra(UR0.b, str);
            if (!this.b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        public a t(Uri uri) {
            this.g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        public a u(String str) {
            this.b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        public a v(CharSequence charSequence) {
            this.b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public a w(String str) {
            this.b.setType(str);
            return this;
        }

        public void x() {
            this.a.startActivity(j());
        }
    }

    /* renamed from: o.s32$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final String f = "IntentReader";
        public final Context a;
        public final Intent b;
        public final String c;
        public final ComponentName d;
        public ArrayList<Uri> e;

        public b(Activity activity) {
            this((Context) C10907yF1.l(activity), activity.getIntent());
        }

        @Deprecated
        public static b a(Activity activity) {
            return new b(activity);
        }

        public ComponentName b() {
            return this.d;
        }

        public Drawable c() {
            if (this.d == null) {
                return null;
            }
            try {
                return this.a.getPackageManager().getActivityIcon(this.d);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f, "Could not retrieve icon for calling activity", e);
                return null;
            }
        }

        public Drawable d() {
            if (this.c == null) {
                return null;
            }
            try {
                return this.a.getPackageManager().getApplicationIcon(this.c);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f, "Could not retrieve icon for calling application", e);
                return null;
            }
        }

        public CharSequence e() {
            if (this.c == null) {
                return null;
            }
            PackageManager packageManager = this.a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.c, 0));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f, "Could not retrieve label for calling application", e);
                return null;
            }
        }

        public String f() {
            return this.c;
        }

        public String[] g() {
            return this.b.getStringArrayExtra("android.intent.extra.BCC");
        }

        public String[] h() {
            return this.b.getStringArrayExtra("android.intent.extra.CC");
        }

        public String[] i() {
            return this.b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public String j() {
            String stringExtra = this.b.getStringExtra(UR0.b);
            if (stringExtra == null) {
                CharSequence o2 = o();
                if (o2 instanceof Spanned) {
                    return Html.toHtml((Spanned) o2);
                }
                if (o2 != null) {
                    return Html.escapeHtml(o2);
                }
                return stringExtra;
            }
            return stringExtra;
        }

        public Uri k() {
            return (Uri) this.b.getParcelableExtra("android.intent.extra.STREAM");
        }

        public Uri l(int i) {
            if (this.e == null && q()) {
                this.e = this.b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.e;
            if (arrayList != null) {
                return arrayList.get(i);
            }
            if (i == 0) {
                return (Uri) this.b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i);
        }

        public int m() {
            if (this.e == null && q()) {
                this.e = this.b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.e;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        public String n() {
            return this.b.getStringExtra("android.intent.extra.SUBJECT");
        }

        public CharSequence o() {
            return this.b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public String p() {
            return this.b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.b.getAction());
        }

        public boolean r() {
            String action = this.b.getAction();
            if (!"android.intent.action.SEND".equals(action) && !"android.intent.action.SEND_MULTIPLE".equals(action)) {
                return false;
            }
            return true;
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.b.getAction());
        }

        public b(Context context, Intent intent) {
            this.a = (Context) C10907yF1.l(context);
            this.b = (Intent) C10907yF1.l(intent);
            this.c = C9399s32.f(intent);
            this.d = C9399s32.d(intent);
        }
    }

    @Deprecated
    public static void a(Menu menu, int i, a aVar) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            b(findItem, aVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i + " in the supplied menu");
    }

    @Deprecated
    public static void b(MenuItem menuItem, a aVar) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(aVar.l());
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(e + aVar.l().getClass().getName());
        shareActionProvider.setShareIntent(aVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    public static ComponentName c(Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return d(intent);
        }
        return callingActivity;
    }

    public static ComponentName d(Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(c);
        if (componentName == null) {
            return (ComponentName) intent.getParcelableExtra(d);
        }
        return componentName;
    }

    public static String e(Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        if (callingPackage == null && intent != null) {
            return f(intent);
        }
        return callingPackage;
    }

    public static String f(Intent intent) {
        String stringExtra = intent.getStringExtra(a);
        if (stringExtra == null) {
            return intent.getStringExtra(b);
        }
        return stringExtra;
    }

    public static void g(Intent intent, ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(UR0.b), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
