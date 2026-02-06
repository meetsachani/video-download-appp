package o;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.O5;

/* loaded from: classes.dex */
public final class P5 {

    /* loaded from: classes.dex */
    public static class a extends O5<Uri, Boolean> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, Uri uri) {
            C6562gT0.p(context, "context");
            C6562gT0.p(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            C6562gT0.o(putExtra, "putExtra(...)");
            return putExtra;
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<Boolean> b(Context context, Uri uri) {
            C6562gT0.p(context, "context");
            C6562gT0.p(uri, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final Boolean c(int i, Intent intent) {
            boolean z;
            if (i == -1) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends O5<String, Uri> {
        public final String a;

        public b(String str) {
            C6562gT0.p(str, "mimeType");
            this.a = str;
        }

        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, String str) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.a).putExtra("android.intent.extra.TITLE", str);
            C6562gT0.o(putExtra, "putExtra(...)");
            return putExtra;
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<Uri> b(Context context, String str) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final Uri c(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }

        @InterfaceC9150r20(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @IR1(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public b() {
            this("*/*");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends O5<String, Uri> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, String str) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            C6562gT0.o(type, "setType(...)");
            return type;
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<Uri> b(Context context, String str) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final Uri c(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends O5<String, List<Uri>> {
        public static final a a = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public final List<Uri> a(Intent intent) {
                C6562gT0.p(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return C8222nF.H();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public a() {
            }
        }

        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, String str) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            C6562gT0.o(putExtra, "putExtra(...)");
            return putExtra;
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<List<Uri>> b(Context context, String str) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final List<Uri> c(int i, Intent intent) {
            List<Uri> a2;
            if (i != -1) {
                intent = null;
            }
            if (intent != null && (a2 = a.a(intent)) != null) {
                return a2;
            }
            return C8222nF.H();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends O5<String[], Uri> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, String[] strArr) {
            C6562gT0.p(context, "context");
            C6562gT0.p(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            C6562gT0.o(type, "setType(...)");
            return type;
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<Uri> b(Context context, String[] strArr) {
            C6562gT0.p(context, "context");
            C6562gT0.p(strArr, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final Uri c(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    /* loaded from: classes.dex */
    public static class f extends O5<Uri, Uri> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, Uri uri) {
            C6562gT0.p(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<Uri> b(Context context, Uri uri) {
            C6562gT0.p(context, "context");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final Uri c(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    /* loaded from: classes.dex */
    public static class g extends O5<String[], List<Uri>> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, String[] strArr) {
            C6562gT0.p(context, "context");
            C6562gT0.p(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            C6562gT0.o(type, "setType(...)");
            return type;
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<List<Uri>> b(Context context, String[] strArr) {
            C6562gT0.p(context, "context");
            C6562gT0.p(strArr, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final List<Uri> c(int i, Intent intent) {
            List<Uri> a;
            if (i != -1) {
                intent = null;
            }
            if (intent != null && (a = d.a.a(intent)) != null) {
                return a;
            }
            return C8222nF.H();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends O5<Void, Uri> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, Void r2) {
            C6562gT0.p(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            C6562gT0.o(type, "setType(...)");
            return type;
        }

        @Override // o.O5
        /* renamed from: e */
        public Uri c(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    /* loaded from: classes.dex */
    public static class i extends O5<TC1, List<Uri>> {
        public static final a b = new a(null);
        public final int a;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public final int a() {
                int pickImagesMaxLimit;
                if (j.a.k()) {
                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                    return pickImagesMaxLimit;
                }
                return Integer.MAX_VALUE;
            }

            public a() {
            }
        }

        public i() {
            this(0, 1, null);
        }

        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, TC1 tc1) {
            int pickImagesMaxLimit;
            j.e d;
            C6562gT0.p(context, "context");
            C6562gT0.p(tc1, "input");
            j.a aVar = j.a;
            if (aVar.k()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.g(tc1.e()));
                int min = Math.min(this.a, tc1.c());
                if (min > 1) {
                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                    if (min <= pickImagesMaxLimit) {
                        intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", min);
                        intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", tc1.b().a());
                        intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", tc1.g());
                        if (tc1.f()) {
                            intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", tc1.a());
                        }
                        if (Build.VERSION.SDK_INT >= 33 && (d = tc1.d()) != null) {
                            intent.putExtra("android.provider.extra.MEDIA_CAPABILITIES", d.c());
                        }
                        return intent;
                    }
                }
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            } else if (aVar.j(context)) {
                ResolveInfo f = aVar.f(context);
                if (f != null) {
                    ActivityInfo activityInfo = f.activityInfo;
                    Intent intent2 = new Intent(j.b);
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(aVar.g(tc1.e()));
                    int min2 = Math.min(this.a, tc1.c());
                    if (min2 > 1) {
                        intent2.putExtra(j.e, min2);
                        intent2.putExtra(j.f, tc1.b().a());
                        intent2.putExtra(j.g, tc1.g());
                        if (tc1.f()) {
                            intent2.putExtra(j.h, tc1.a());
                        }
                        return intent2;
                    }
                    throw new IllegalArgumentException("Max items must be greater than 1");
                }
                throw new IllegalStateException("Required value was null.");
            } else {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.g(tc1.e()));
                intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent3.getType() == null) {
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent3;
            }
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<List<Uri>> b(Context context, TC1 tc1) {
            C6562gT0.p(context, "context");
            C6562gT0.p(tc1, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final List<Uri> c(int i, Intent intent) {
            List<Uri> a2;
            if (i != -1) {
                intent = null;
            }
            if (intent != null && (a2 = d.a.a(intent)) != null) {
                return a2;
            }
            return C8222nF.H();
        }

        public i(int i) {
            this.a = i;
            if (i <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }

        public /* synthetic */ i(int i, int i2, C9516sY c9516sY) {
            this((i2 & 1) != 0 ? b.a() : i);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends O5<TC1, Uri> {
        public static final a a = new a(null);
        public static final String b = "androidx.activity.result.contract.action.PICK_IMAGES";
        public static final String c = "com.google.android.gms.provider.action.PICK_IMAGES";
        public static final String d = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";
        public static final String e = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        public static final String f = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB";
        public static final String g = "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER";
        public static final String h = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR";

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            @InterfaceC9511sW0
            public final ResolveInfo f(Context context) {
                C6562gT0.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.b), 1114112);
            }

            public final String g(h hVar) {
                C6562gT0.p(hVar, "input");
                if (hVar instanceof d) {
                    return "image/*";
                }
                if (hVar instanceof g) {
                    return "video/*";
                }
                if (hVar instanceof f) {
                    return ((f) hVar).a();
                }
                if (hVar instanceof c) {
                    return null;
                }
                throw new C3865Oq1();
            }

            @InterfaceC9511sW0
            @InterfaceC9150r20(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @IR1(expression = "isPhotoPickerAvailable(context)", imports = {}))
            public final boolean h() {
                return k();
            }

            @InterfaceC9511sW0
            public final boolean i(Context context) {
                C6562gT0.p(context, "context");
                if (!k() && !j(context)) {
                    return false;
                }
                return true;
            }

            @InterfaceC9511sW0
            public final boolean j(Context context) {
                C6562gT0.p(context, "context");
                if (f(context) != null) {
                    return true;
                }
                return false;
            }

            @InterfaceC9511sW0
            public final boolean k() {
                int extensionVersion;
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    return true;
                }
                if (i >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion >= 2) {
                        return true;
                    }
                }
                return false;
            }

            public a() {
            }

            public static /* synthetic */ void a() {
            }

            public static /* synthetic */ void b() {
            }

            public static /* synthetic */ void c() {
            }

            public static /* synthetic */ void d() {
            }

            public static /* synthetic */ void e() {
            }
        }

        /* loaded from: classes.dex */
        public static abstract class b {

            /* loaded from: classes.dex */
            public static final class a extends b {
                public static final a a = new a();
                public static final int b = 0;

                public a() {
                    super(null);
                }

                @Override // o.P5.j.b
                public int a() {
                    return b;
                }
            }

            /* renamed from: o.P5$j$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0222b extends b {
                public static final C0222b a = new C0222b();
                public static final int b = 1;

                public C0222b() {
                    super(null);
                }

                @Override // o.P5.j.b
                public int a() {
                    return b;
                }
            }

            public /* synthetic */ b(C9516sY c9516sY) {
                this();
            }

            public abstract int a();

            public b() {
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements h {
            public static final c a = new c();
        }

        /* loaded from: classes.dex */
        public static final class d implements h {
            public static final d a = new d();
        }

        /* loaded from: classes.dex */
        public static final class e {
            public static final b b = new b(null);
            public static final int c = 0;
            public static final int d = 1;
            public static final int e = 2;
            public static final int f = 3;
            public Set<Integer> a = B22.k();

            /* loaded from: classes.dex */
            public static final class a {
                public Set<Integer> a = new LinkedHashSet();

                public final a a(int i) {
                    this.a.add(Integer.valueOf(i));
                    return this;
                }

                public final e b() {
                    e eVar = new e();
                    eVar.b(this.a);
                    return eVar;
                }
            }

            /* loaded from: classes.dex */
            public static final class b {

                @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
                @InterfaceC7780lU1(EnumC7796la.X)
                @Retention(RetentionPolicy.SOURCE)
                @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.g1, EnumC8057ma.Y0, EnumC8057ma.b1})
                /* loaded from: classes.dex */
                public @interface a {
                }

                public /* synthetic */ b(C9516sY c9516sY) {
                    this();
                }

                public b() {
                }
            }

            public final Set<Integer> a() {
                return this.a;
            }

            public final void b(Set<Integer> set) {
                C6562gT0.p(set, "<set-?>");
                this.a = set;
            }

            public final ApplicationMediaCapabilities c() {
                ApplicationMediaCapabilities build;
                ApplicationMediaCapabilities.Builder a2 = V5.a();
                a2.addSupportedVideoMimeType(C4128Rj1.k);
                for (Number number : this.a) {
                    int intValue = number.intValue();
                    if (intValue == 0) {
                        a2.addSupportedHdrType("android.media.feature.hdr.hlg");
                    } else if (intValue == 1) {
                        a2.addSupportedHdrType("android.media.feature.hdr.hdr10");
                    } else if (intValue == 2) {
                        a2.addSupportedHdrType("android.media.feature.hdr.hdr10_plus");
                    } else if (intValue == 3) {
                        a2.addSupportedHdrType("android.media.feature.hdr.dolby_vision");
                    }
                }
                build = a2.build();
                C6562gT0.o(build, "build(...)");
                return build;
            }
        }

        /* loaded from: classes.dex */
        public static final class f implements h {
            public final String a;

            public f(String str) {
                C6562gT0.p(str, "mimeType");
                this.a = str;
            }

            public final String a() {
                return this.a;
            }
        }

        /* loaded from: classes.dex */
        public static final class g implements h {
            public static final g a = new g();
        }

        /* loaded from: classes.dex */
        public interface h {
        }

        @InterfaceC9511sW0
        public static final ResolveInfo f(Context context) {
            return a.f(context);
        }

        @InterfaceC9511sW0
        @InterfaceC9150r20(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @IR1(expression = "isPhotoPickerAvailable(context)", imports = {}))
        public static final boolean g() {
            return a.h();
        }

        @InterfaceC9511sW0
        public static final boolean h(Context context) {
            return a.i(context);
        }

        @InterfaceC9511sW0
        public static final boolean i(Context context) {
            return a.j(context);
        }

        @InterfaceC9511sW0
        public static final boolean j() {
            return a.k();
        }

        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, TC1 tc1) {
            e d2;
            C6562gT0.p(context, "context");
            C6562gT0.p(tc1, "input");
            a aVar = a;
            if (aVar.k()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.g(tc1.e()));
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", tc1.b().a());
                if (tc1.f()) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", tc1.a());
                }
                if (Build.VERSION.SDK_INT >= 33 && (d2 = tc1.d()) != null) {
                    intent.putExtra("android.provider.extra.MEDIA_CAPABILITIES", d2.c());
                }
                return intent;
            } else if (aVar.j(context)) {
                ResolveInfo f2 = aVar.f(context);
                if (f2 != null) {
                    ActivityInfo activityInfo = f2.activityInfo;
                    Intent intent2 = new Intent(b);
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(aVar.g(tc1.e()));
                    intent2.putExtra(f, tc1.b().a());
                    if (tc1.f()) {
                        intent2.putExtra(h, tc1.a());
                    }
                    return intent2;
                }
                throw new IllegalStateException("Required value was null.");
            } else {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.g(tc1.e()));
                if (intent3.getType() == null) {
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent3;
            }
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<Uri> b(Context context, TC1 tc1) {
            C6562gT0.p(context, "context");
            C6562gT0.p(tc1, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: k */
        public final Uri c(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                return (Uri) C10662xF.J2(d.a.a(intent));
            }
            return data;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends O5<String[], Map<String, Boolean>> {
        public static final a a = new a(null);
        public static final String b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final String c = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final String d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public final Intent a(String[] strArr) {
                C6562gT0.p(strArr, "input");
                Intent putExtra = new Intent(k.b).putExtra(k.c, strArr);
                C6562gT0.o(putExtra, "putExtra(...)");
                return putExtra;
            }

            public a() {
            }
        }

        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, String[] strArr) {
            C6562gT0.p(context, "context");
            C6562gT0.p(strArr, "input");
            return a.a(strArr);
        }

        @Override // o.O5
        /* renamed from: e */
        public O5.a<Map<String, Boolean>> b(Context context, String[] strArr) {
            C6562gT0.p(context, "context");
            C6562gT0.p(strArr, "input");
            if (strArr.length == 0) {
                return new O5.a<>(C8926q81.z());
            }
            for (String str : strArr) {
                if (C10201vM.a(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(strArr.length), 16));
            for (String str2 : strArr) {
                C4180Rx1 a2 = C6670gv2.a(str2, Boolean.TRUE);
                linkedHashMap.put(a2.e(), a2.f());
            }
            return new O5.a<>(linkedHashMap);
        }

        @Override // o.O5
        /* renamed from: f */
        public Map<String, Boolean> c(int i, Intent intent) {
            boolean z;
            if (i != -1) {
                return C8926q81.z();
            }
            if (intent == null) {
                return C8926q81.z();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(c);
            int[] intArrayExtra = intent.getIntArrayExtra(d);
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                return C8926q81.B0(C10662xF.m6(C7330jf.cb(stringArrayExtra), arrayList));
            }
            return C8926q81.z();
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends O5<String, Boolean> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, String str) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "input");
            return k.a.a(new String[]{str});
        }

        @Override // o.O5
        /* renamed from: e */
        public O5.a<Boolean> b(Context context, String str) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "input");
            if (C10201vM.a(context, str) == 0) {
                return new O5.a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public Boolean c(int i, Intent intent) {
            if (intent != null && i == -1) {
                int[] intArrayExtra = intent.getIntArrayExtra(k.d);
                boolean z = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (intArrayExtra[i2] == 0) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends O5<Intent, G5> {
        public static final a a = new a(null);
        public static final String b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public a() {
            }
        }

        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, Intent intent) {
            C6562gT0.p(context, "context");
            C6562gT0.p(intent, "input");
            return intent;
        }

        @Override // o.O5
        /* renamed from: e */
        public G5 c(int i, Intent intent) {
            return new G5(i, intent);
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends O5<C9254rS0, G5> {
        public static final a a = new a(null);
        public static final String b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final String c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final String d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public a() {
            }
        }

        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, C9254rS0 c9254rS0) {
            C6562gT0.p(context, "context");
            C6562gT0.p(c9254rS0, "input");
            Intent putExtra = new Intent(b).putExtra(c, c9254rS0);
            C6562gT0.o(putExtra, "putExtra(...)");
            return putExtra;
        }

        @Override // o.O5
        /* renamed from: e */
        public G5 c(int i, Intent intent) {
            return new G5(i, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class o extends O5<Uri, Boolean> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, Uri uri) {
            C6562gT0.p(context, "context");
            C6562gT0.p(uri, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            C6562gT0.o(putExtra, "putExtra(...)");
            return putExtra;
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<Boolean> b(Context context, Uri uri) {
            C6562gT0.p(context, "context");
            C6562gT0.p(uri, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final Boolean c(int i, Intent intent) {
            boolean z;
            if (i == -1) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes.dex */
    public static class p extends O5<Void, Bitmap> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, Void r2) {
            C6562gT0.p(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<Bitmap> b(Context context, Void r2) {
            C6562gT0.p(context, "context");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final Bitmap c(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra("data");
        }
    }

    @InterfaceC9150r20(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    /* loaded from: classes.dex */
    public static class q extends O5<Uri, Bitmap> {
        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, Uri uri) {
            C6562gT0.p(context, "context");
            C6562gT0.p(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            C6562gT0.o(putExtra, "putExtra(...)");
            return putExtra;
        }

        @Override // o.O5
        /* renamed from: e */
        public final O5.a<Bitmap> b(Context context, Uri uri) {
            C6562gT0.p(context, "context");
            C6562gT0.p(uri, "input");
            return null;
        }

        @Override // o.O5
        /* renamed from: f */
        public final Bitmap c(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra("data");
        }
    }
}
