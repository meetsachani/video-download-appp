package o;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import o.KL;

/* renamed from: o.fQ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6295fQ0 {
    public static final String a = "InputConnectionCompat";
    public static final String b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o  reason: collision with root package name */
    public static final String f742o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int p = 1;
    public static final String q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* renamed from: o.fQ0$a */
    /* loaded from: classes.dex */
    public class a extends InputConnectionWrapper {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z, d dVar) {
            super(inputConnection, z);
            this.a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.a.a(C6550gQ0.g(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: o.fQ0$b */
    /* loaded from: classes.dex */
    public class b extends InputConnectionWrapper {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputConnection inputConnection, boolean z, d dVar) {
            super(inputConnection, z);
            this.a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C6295fQ0.f(str, bundle, this.a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: o.fQ0$c */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: o.fQ0$d */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(C6550gQ0 c6550gQ0, int i, Bundle bundle);
    }

    public static /* synthetic */ boolean a(View view, C6550gQ0 c6550gQ0, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                c6550gQ0.e();
                Parcelable parcelable = (Parcelable) c6550gQ0.f();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable(q, parcelable);
            } catch (Exception e2) {
                Log.w(a, "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        if (C6516gH2.t1(view, new KL.b(new ClipData(c6550gQ0.b(), new ClipData.Item(c6550gQ0.a())), 2).e(c6550gQ0.c()).c(bundle).a()) != null) {
            return false;
        }
        return true;
    }

    public static boolean b(InputConnection inputConnection, EditorInfo editorInfo, C6550gQ0 c6550gQ0, int i2, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (Build.VERSION.SDK_INT >= 25) {
            return c.a(inputConnection, C5810dQ0.a(c6550gQ0.f()), i2, bundle);
        }
        int e2 = N90.e(editorInfo);
        if (e2 != 2) {
            z = false;
            if (e2 != 3 && e2 != 4) {
                return false;
            }
        } else {
            z = true;
        }
        Bundle bundle2 = new Bundle();
        if (z) {
            str = e;
        } else {
            str = d;
        }
        bundle2.putParcelable(str, c6550gQ0.a());
        if (z) {
            str2 = g;
        } else {
            str2 = f;
        }
        bundle2.putParcelable(str2, c6550gQ0.b());
        if (z) {
            str3 = i;
        } else {
            str3 = h;
        }
        bundle2.putParcelable(str3, c6550gQ0.c());
        if (z) {
            str4 = m;
        } else {
            str4 = l;
        }
        bundle2.putInt(str4, i2);
        if (z) {
            str5 = k;
        } else {
            str5 = j;
        }
        bundle2.putParcelable(str5, bundle);
        if (z) {
            str6 = c;
        } else {
            str6 = b;
        }
        return inputConnection.performPrivateCommand(str6, bundle2);
    }

    public static d c(final View view) {
        C10907yF1.l(view);
        return new d() { // from class: o.eQ0
            @Override // o.C6295fQ0.d
            public final boolean a(C6550gQ0 c6550gQ0, int i2, Bundle bundle) {
                return C6295fQ0.a(view, c6550gQ0, i2, bundle);
            }
        };
    }

    public static InputConnection d(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return e(inputConnection, editorInfo, c(view));
    }

    @Deprecated
    public static InputConnection e(InputConnection inputConnection, EditorInfo editorInfo, d dVar) {
        C2691Ct1.e(inputConnection, "inputConnection must be non-null");
        C2691Ct1.e(editorInfo, "editorInfo must be non-null");
        C2691Ct1.e(dVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, dVar);
        }
        if (N90.a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new b(inputConnection, false, dVar);
    }

    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static boolean f(String str, Bundle bundle, d dVar) {
        boolean z;
        String str2;
        ResultReceiver resultReceiver;
        ResultReceiver resultReceiver2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(b, str)) {
            z = false;
        } else if (!TextUtils.equals(c, str)) {
            return false;
        } else {
            z = true;
        }
        if (z) {
            str2 = f742o;
        } else {
            str2 = n;
        }
        try {
            resultReceiver2 = (ResultReceiver) bundle.getParcelable(str2);
            if (z) {
                str3 = e;
            } else {
                str3 = d;
            }
        } catch (Throwable th) {
            th = th;
            resultReceiver = null;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(str3);
            if (z) {
                str4 = g;
            } else {
                str4 = f;
            }
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
            if (z) {
                str5 = i;
            } else {
                str5 = h;
            }
            Uri uri2 = (Uri) bundle.getParcelable(str5);
            if (z) {
                str6 = m;
            } else {
                str6 = l;
            }
            int i2 = bundle.getInt(str6);
            if (z) {
                str7 = k;
            } else {
                str7 = j;
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
            if (uri != null && clipDescription != null) {
                r0 = dVar.a(new C6550gQ0(uri, clipDescription, uri2), i2, bundle2);
            }
            if (resultReceiver2 != null) {
                resultReceiver2.send(r0, null);
            }
            return r0;
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = resultReceiver2;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }
}
