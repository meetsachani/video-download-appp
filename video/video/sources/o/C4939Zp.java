package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* renamed from: o.Zp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4939Zp {
    public static final String b = "BrowserActions";
    public static final String c = "https://www.example.com";
    public static final String d = "androidx.browser.browseractions.APP_ID";
    public static final String e = "androidx.browser.browseractions.browser_action_open";
    public static final String f = "androidx.browser.browseractions.ICON_ID";
    public static final String g = "androidx.browser.browseractions.ICON_URI";
    public static final String h = "androidx.browser.browseractions.TITLE";
    public static final String i = "androidx.browser.browseractions.ACTION";
    public static final String j = "androidx.browser.browseractions.extra.TYPE";
    public static final String k = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final String l = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final int m = 5;
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f687o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public static final int r = 4;
    public static final int s = 5;
    public static final int t = -1;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static a z;
    public final Intent a;

    /* renamed from: o.Zp$a */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Zp$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Zp$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* renamed from: o.Zp$d */
    /* loaded from: classes.dex */
    public static final class d {
        public Context b;
        public Uri c;
        public final Intent a = new Intent(C4939Zp.e);
        public int d = 0;
        public ArrayList<Bundle> e = new ArrayList<>();
        public PendingIntent f = null;
        public List<Uri> g = new ArrayList();

        public d(Context context, Uri uri) {
            this.b = context;
            this.c = uri;
        }

        public C4939Zp a() {
            this.a.setData(this.c);
            this.a.putExtra(C4939Zp.j, this.d);
            this.a.putParcelableArrayListExtra(C4939Zp.k, this.e);
            this.a.putExtra(C4939Zp.d, PendingIntent.getActivity(this.b, 0, new Intent(), 67108864));
            PendingIntent pendingIntent = this.f;
            if (pendingIntent != null) {
                this.a.putExtra(C4939Zp.l, pendingIntent);
            }
            C5179aq.n(this.a, this.g, this.b);
            return new C4939Zp(this.a);
        }

        public final Bundle b(C4541Vp c4541Vp) {
            Bundle bundle = new Bundle();
            bundle.putString(C4939Zp.h, c4541Vp.e());
            bundle.putParcelable(C4939Zp.i, c4541Vp.a());
            if (c4541Vp.b() != 0) {
                bundle.putInt(C4939Zp.f, c4541Vp.b());
            }
            if (c4541Vp.c() != null) {
                bundle.putParcelable(C4939Zp.g, c4541Vp.c());
            }
            return bundle;
        }

        public d c(ArrayList<C4541Vp> arrayList) {
            if (arrayList.size() <= 5) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!TextUtils.isEmpty(arrayList.get(i).e()) && arrayList.get(i).a() != null) {
                        this.e.add(b(arrayList.get(i)));
                        if (arrayList.get(i).c() != null) {
                            this.g.add(arrayList.get(i).c());
                        }
                    } else {
                        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                    }
                }
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        public d d(C4541Vp... c4541VpArr) {
            return c(new ArrayList<>(Arrays.asList(c4541VpArr)));
        }

        public d e(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public d f(int i) {
            this.d = i;
            return this;
        }
    }

    public C4939Zp(Intent intent) {
        this.a = intent;
    }

    public static List<ResolveInfo> a(Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(e, Uri.parse(c)), 131072);
    }

    @Deprecated
    public static String b(Intent intent) {
        return d(intent);
    }

    public static String d(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(d);
        if (pendingIntent != null) {
            return pendingIntent.getTargetPackage();
        }
        return null;
    }

    public static void e(Context context, Intent intent) {
        f(context, intent, a(context));
    }

    public static void f(Context context, Intent intent, List<ResolveInfo> list) {
        if (list != null && list.size() != 0) {
            int i2 = 0;
            if (list.size() == 1) {
                intent.setPackage(list.get(0).activityInfo.packageName);
            } else {
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(c)), 65536);
                if (resolveActivity != null) {
                    String str = resolveActivity.activityInfo.packageName;
                    while (true) {
                        if (i2 >= list.size()) {
                            break;
                        } else if (str.equals(list.get(i2).activityInfo.packageName)) {
                            intent.setPackage(str);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            C10201vM.A(context, intent, null);
            return;
        }
        i(context, intent);
    }

    public static void g(Context context, Uri uri) {
        e(context, new d(context, uri).a().c());
    }

    public static void h(Context context, Uri uri, int i2, ArrayList<C4541Vp> arrayList, PendingIntent pendingIntent) {
        e(context, new d(context, uri).f(i2).c(arrayList).e(pendingIntent).a().c());
    }

    public static void i(Context context, Intent intent) {
        List<C4541Vp> list;
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(k);
        if (parcelableArrayListExtra != null) {
            list = k(parcelableArrayListExtra);
        } else {
            list = null;
        }
        j(context, data, list);
    }

    public static void j(Context context, Uri uri, List<C4541Vp> list) {
        new C4832Yp(context, uri, list).e();
        a aVar = z;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static List<C4541Vp> k(ArrayList<Bundle> arrayList) {
        C4541Vp c4541Vp;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bundle bundle = arrayList.get(i2);
            String string = bundle.getString(h);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(i);
            int i3 = bundle.getInt(f);
            Uri uri = (Uri) bundle.getParcelable(g);
            if (!TextUtils.isEmpty(string) && pendingIntent != null) {
                if (i3 != 0) {
                    c4541Vp = new C4541Vp(string, pendingIntent, i3);
                } else {
                    c4541Vp = new C4541Vp(string, pendingIntent, uri);
                }
                arrayList2.add(c4541Vp);
            } else {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
        }
        return arrayList2;
    }

    public static void l(a aVar) {
        z = aVar;
    }

    public Intent c() {
        return this.a;
    }
}
