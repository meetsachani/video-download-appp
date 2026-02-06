package com.facebook.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.M;
import com.facebook.bolts.C2333e;
import com.facebook.internal.r;
import com.facebook.messenger.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.C10763xf2;
import o.C5033aE;
import o.C6562gT0;
import o.C7458kA2;
import o.C8222nF;
import o.C9998uW1;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class c {
    @NotNull
    public static final c a = new c();
    @NotNull
    public static final String b = "MessengerUtils";
    @NotNull
    public static final String c = "com.facebook.orca";
    @NotNull
    public static final String d = "com.facebook.orca.extra.PROTOCOL_VERSION";
    @NotNull
    public static final String e = "com.facebook.orca.extra.APPLICATION_ID";
    @NotNull
    public static final String f = "com.facebook.orca.extra.REPLY_TOKEN";
    @NotNull
    public static final String g = "com.facebook.orca.extra.THREAD_TOKEN";
    @NotNull
    public static final String h = "com.facebook.orca.extra.METADATA";
    @NotNull
    public static final String i = "com.facebook.orca.extra.EXTERNAL_URI";
    @NotNull
    public static final String j = "com.facebook.orca.extra.PARTICIPANTS";
    @NotNull
    public static final String k = "com.facebook.orca.extra.IS_REPLY";
    @NotNull
    public static final String l = "com.facebook.orca.extra.IS_COMPOSE";
    public static final int m = 20150314;
    @NotNull
    public static final String n = "com.facebook.orca.category.PLATFORM_THREAD_20150314";

    public final void a(@NotNull Activity activity, @NotNull e eVar) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        C6562gT0.p(eVar, "shareToMessengerParams");
        Intent intent = activity.getIntent();
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            activity.setResult(0, null);
            activity.finish();
        } else if (categories.contains(n)) {
            C2333e c2333e = C2333e.a;
            C6562gT0.o(intent, "originalIntent");
            Bundle b2 = C2333e.b(intent);
            Intent intent2 = new Intent();
            if (b2 != null && categories.contains(n)) {
                intent2.putExtra(d, m);
                intent2.putExtra(g, b2.getString(g));
                intent2.setDataAndType(eVar.g(), eVar.f());
                intent2.setFlags(1);
                M m2 = M.a;
                intent2.putExtra(e, M.o());
                intent2.putExtra(h, eVar.e());
                intent2.putExtra(i, eVar.d());
                activity.setResult(-1, intent2);
                activity.finish();
                return;
            }
            throw new RuntimeException();
        } else {
            activity.setResult(0, null);
            activity.finish();
        }
    }

    public final Set<Integer> b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        HashSet hashSet = new HashSet();
        Cursor query = contentResolver.query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[]{"version"}, null, null, null);
        if (query == null) {
            return hashSet;
        }
        try {
            int columnIndex = query.getColumnIndex("version");
            while (query.moveToNext()) {
                hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(query, null);
            return hashSet;
        } finally {
        }
    }

    @Nullable
    public final b c(@NotNull Intent intent) {
        String string;
        String string2;
        String string3;
        Boolean valueOf;
        Boolean valueOf2;
        b.a aVar;
        if (SQ.e(this)) {
            return null;
        }
        try {
            C6562gT0.p(intent, C9998uW1.R);
            Set<String> categories = intent.getCategories();
            if (categories != null && categories.contains(n)) {
                C2333e c2333e = C2333e.a;
                Bundle b2 = C2333e.b(intent);
                if (b2 == null) {
                    string = null;
                } else {
                    string = b2.getString(g);
                }
                if (b2 == null) {
                    string2 = null;
                } else {
                    string2 = b2.getString(h);
                }
                if (b2 == null) {
                    string3 = null;
                } else {
                    string3 = b2.getString(j);
                }
                if (b2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(b2.getBoolean(k));
                }
                if (b2 == null) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(b2.getBoolean(l));
                }
                Boolean bool = Boolean.TRUE;
                if (C6562gT0.g(valueOf, bool)) {
                    aVar = b.a.REPLY_FLOW;
                } else if (C6562gT0.g(valueOf2, bool)) {
                    aVar = b.a.COMPOSE_FLOW;
                } else {
                    aVar = b.a.UNKNOWN;
                }
                if (string != null && string2 != null) {
                    return new b(aVar, string, string2, f(string3));
                }
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean d(@NotNull Context context) {
        C6562gT0.p(context, "context");
        r rVar = r.a;
        return r.a(context, c);
    }

    public final void e(@NotNull Context context) {
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(context, "context");
                try {
                    i(context, "market://details?id=com.facebook.orca");
                } catch (ActivityNotFoundException unused) {
                    i(context, "http://play.google.com/store/apps/details?id=com.facebook.orca");
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final List<String> f(String str) {
        int i2;
        boolean z;
        if (str != null && str.length() != 0) {
            Object[] array = C10763xf2.o5(str, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str2 : strArr) {
                    int length = str2.length() - 1;
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 <= length) {
                        if (!z2) {
                            i2 = i3;
                        } else {
                            i2 = length;
                        }
                        if (C6562gT0.t(str2.charAt(i2), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (!z) {
                                z2 = true;
                            } else {
                                i3++;
                            }
                        } else if (!z) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    arrayList.add(str2.subSequence(i3, length + 1).toString());
                }
                return arrayList;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return C8222nF.H();
    }

    public final void g(@NotNull Activity activity, int i2, @NotNull e eVar) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            C6562gT0.p(eVar, "shareToMessengerParams");
            if (!d(activity)) {
                e(activity);
            } else if (b(activity).contains(Integer.valueOf((int) m))) {
                h(activity, i2, eVar);
            } else {
                e(activity);
            }
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void h(Activity activity, int i2, e eVar) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setFlags(1);
            intent.setPackage(c);
            intent.putExtra("android.intent.extra.STREAM", eVar.g());
            intent.setType(eVar.f());
            intent.putExtra(d, m);
            M m2 = M.a;
            intent.putExtra(e, M.o());
            intent.putExtra(h, eVar.e());
            intent.putExtra(i, eVar.d());
            activity.startActivityForResult(intent, i2);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(activity.getPackageManager().getLaunchIntentForPackage(c));
        }
    }

    public final void i(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
