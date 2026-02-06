package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import o.C10201vM;
import o.C10231vT1;
import o.C10907yF1;
import o.C2691Ct1;
import o.C4500Ve2;
import o.C9432sC;
import o.C9811tl1;
import o.OA;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final String A = "obj";
    public static final String B = "int1";
    public static final String C = "int2";
    public static final String D = "tint_list";
    public static final String E = "tint_mode";
    public static final String F = "string1";
    public static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;
    public static final String k = "IconCompat";
    public static final int l = -1;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f29o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 6;
    public static final float s = 0.25f;
    public static final float t = 0.6666667f;
    public static final float u = 0.9166667f;
    public static final float v = 0.010416667f;
    public static final float w = 0.020833334f;
    public static final int x = 61;
    public static final int y = 30;
    public static final String z = "type";
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    /* loaded from: classes.dex */
    public static class a {
        public static IconCompat a(Context context, Icon icon) {
            int e = e(icon);
            if (e != 2) {
                if (e != 4) {
                    if (e != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.b = icon;
                        return iconCompat;
                    }
                    return IconCompat.p(f(icon));
                }
                return IconCompat.s(f(icon));
            }
            String d = d(icon);
            try {
                return IconCompat.w(IconCompat.A(context, d), d, c(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }

        public static IconCompat b(Object obj) {
            C10907yF1.l(obj);
            int e = e(obj);
            if (e != 2) {
                if (e != 4) {
                    if (e != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.b = obj;
                        return iconCompat;
                    }
                    return IconCompat.p(f(obj));
                }
                return IconCompat.s(f(obj));
            }
            return IconCompat.w(null, d(obj), c(obj));
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.k, "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e(IconCompat.k, "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e(IconCompat.k, "Unable to get icon resource", e3);
                return 0;
            }
        }

        public static String d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.k, "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e(IconCompat.k, "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e(IconCompat.k, "Unable to get icon package", e3);
                return null;
            }
        }

        public static int e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.k, "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e(IconCompat.k, "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e(IconCompat.k, "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        public static Uri f(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.k, "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e(IconCompat.k, "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e(IconCompat.k, "Unable to get icon uri", e3);
                return null;
            }
        }

        public static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon h(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.a) {
                case -1:
                    return (Icon) iconCompat.b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.z(), iconCompat.e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = b.b((Bitmap) iconCompat.b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.n((Bitmap) iconCompat.b, false));
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        createWithBitmap = d.a(iconCompat.C());
                        break;
                    } else if (context != null) {
                        InputStream D = iconCompat.D(context);
                        if (D != null) {
                            if (i >= 26) {
                                createWithBitmap = b.b(BitmapFactory.decodeStream(D));
                                break;
                            } else {
                                createWithBitmap = Icon.createWithBitmap(IconCompat.n(BitmapFactory.decodeStream(D), false));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.C());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.C());
                    }
            }
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.G) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = G;
        this.i = null;
    }

    public static Resources A(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo == null) {
                return null;
            }
            return packageManager.getResourcesForApplication(applicationInfo);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(k, String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    public static String M(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat j(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.e = bundle.getInt(B);
        iconCompat.f = bundle.getInt(C);
        iconCompat.j = bundle.getString(F);
        if (bundle.containsKey(D)) {
            iconCompat.g = (ColorStateList) bundle.getParcelable(D);
        }
        if (bundle.containsKey(E)) {
            iconCompat.h = PorterDuff.Mode.valueOf(bundle.getString(E));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.b = bundle.getParcelable(A);
                return iconCompat;
            case 0:
            default:
                Log.w(k, "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.b = bundle.getString(A);
                return iconCompat;
            case 3:
                iconCompat.b = bundle.getByteArray(A);
                return iconCompat;
        }
    }

    public static IconCompat k(Context context, Icon icon) {
        C10907yF1.l(icon);
        return a.a(context, icon);
    }

    public static IconCompat l(Icon icon) {
        return a.b(icon);
    }

    public static IconCompat m(Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    public static Bitmap n(Bitmap bitmap, boolean z2) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z2) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, C9432sC.c1);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, C9432sC.d1);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat o(Bitmap bitmap) {
        C2691Ct1.d(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat p(Uri uri) {
        C2691Ct1.d(uri);
        return q(uri.toString());
    }

    public static IconCompat q(String str) {
        C2691Ct1.d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.b = str;
        return iconCompat;
    }

    public static IconCompat r(Bitmap bitmap) {
        C2691Ct1.d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat s(Uri uri) {
        C2691Ct1.d(uri);
        return t(uri.toString());
    }

    public static IconCompat t(String str) {
        C2691Ct1.d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.b = str;
        return iconCompat;
    }

    public static IconCompat u(byte[] bArr, int i, int i2) {
        C2691Ct1.d(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.b = bArr;
        iconCompat.e = i;
        iconCompat.f = i2;
        return iconCompat;
    }

    public static IconCompat v(Context context, int i) {
        C2691Ct1.d(context);
        return w(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat w(Resources resources, String str, int i) {
        C2691Ct1.d(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            iconCompat.j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public int B() {
        int i = this.a;
        if (i == -1) {
            return a.e(this.b);
        }
        return i;
    }

    public Uri C() {
        int i = this.a;
        if (i == -1) {
            return a.f(this.b);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.b);
    }

    public InputStream D(Context context) {
        Uri C2 = C();
        String scheme = C2.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.b));
            } catch (FileNotFoundException e2) {
                Log.w(k, "Unable to load image from path: " + C2, e2);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(C2);
        } catch (Exception e3) {
            Log.w(k, "Unable to load image from URI: " + C2, e3);
            return null;
        }
    }

    public Drawable E(Context context) {
        i(context);
        return a.g(L(context), context);
    }

    public final Drawable F(Context context) {
        switch (this.a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.b);
            case 2:
                String z2 = z();
                if (TextUtils.isEmpty(z2)) {
                    z2 = context.getPackageName();
                }
                try {
                    return C10231vT1.g(A(context, z2), this.e, context.getTheme());
                } catch (RuntimeException e2) {
                    Log.e(k, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.e), this.b), e2);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.b, this.e, this.f));
            case 4:
                InputStream D2 = D(context);
                if (D2 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(D2));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), n((Bitmap) this.b, false));
            case 6:
                InputStream D3 = D(context);
                if (D3 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(D3)));
                    }
                    return new BitmapDrawable(context.getResources(), n(BitmapFactory.decodeStream(D3), false));
                }
                break;
        }
        return null;
    }

    public IconCompat G(int i) {
        return H(ColorStateList.valueOf(i));
    }

    public IconCompat H(ColorStateList colorStateList) {
        this.g = colorStateList;
        return this;
    }

    public IconCompat I(PorterDuff.Mode mode) {
        this.h = mode;
        return this;
    }

    public Bundle J() {
        Bundle bundle = new Bundle();
        switch (this.a) {
            case -1:
                bundle.putParcelable(A, (Parcelable) this.b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(A, (Bitmap) this.b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(A, (String) this.b);
                break;
            case 3:
                bundle.putByteArray(A, (byte[]) this.b);
                break;
        }
        bundle.putInt("type", this.a);
        bundle.putInt(B, this.e);
        bundle.putInt(C, this.f);
        bundle.putString(F, this.j);
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            bundle.putParcelable(D, colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != G) {
            bundle.putString(E, mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon K() {
        return L(null);
    }

    public Icon L(Context context) {
        return a.h(this, context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void a() {
        this.h = PorterDuff.Mode.valueOf(this.i);
        switch (this.a) {
            case -1:
                Parcelable parcelable = this.d;
                if (parcelable != null) {
                    this.b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.d;
                if (parcelable2 != null) {
                    this.b = parcelable2;
                    return;
                }
                byte[] bArr = this.c;
                this.b = bArr;
                this.a = 3;
                this.e = 0;
                this.f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.c, Charset.forName(OA.c));
                this.b = str;
                if (this.a == 2 && this.j == null) {
                    this.j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.b = this.c;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void g(boolean z2) {
        this.i = this.h.name();
        switch (this.a) {
            case -1:
                if (!z2) {
                    this.d = (Parcelable) this.b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z2) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.d = (Parcelable) this.b;
                return;
            case 2:
                this.c = ((String) this.b).getBytes(Charset.forName(OA.c));
                return;
            case 3:
                this.c = (byte[]) this.b;
                return;
            case 4:
            case 6:
                this.c = this.b.toString().getBytes(Charset.forName(OA.c));
                return;
        }
    }

    public void h(Intent intent, Drawable drawable, Context context) {
        Bitmap bitmap;
        i(context);
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 5) {
                    bitmap = n((Bitmap) this.b, true);
                } else {
                    throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                }
            } else {
                try {
                    Context createPackageContext = context.createPackageContext(z(), 0);
                    if (drawable == null) {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.e));
                        return;
                    }
                    Drawable l2 = C10201vM.l(createPackageContext, this.e);
                    if (l2.getIntrinsicWidth() > 0 && l2.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(l2.getIntrinsicWidth(), l2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        l2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        l2.draw(new Canvas(bitmap));
                    }
                    int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService(androidx.appcompat.widget.b.r)).getLauncherLargeIconSize();
                    bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                    l2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    l2.draw(new Canvas(bitmap));
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException("Can't find package " + this.b, e2);
                }
            }
        } else {
            bitmap = (Bitmap) this.b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    public void i(Context context) {
        Object obj;
        if (this.a == 2 && (obj = this.b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split(RemoteSettings.i, -1)[0];
                String str4 = str2.split(RemoteSettings.i, -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i(k, "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String z2 = z();
                int identifier = A(context, z2).getIdentifier(str4, str3, str5);
                if (this.e != identifier) {
                    Log.i(k, "Id has changed for " + z2 + C4500Ve2.b + str);
                    this.e = identifier;
                }
            }
        }
    }

    public String toString() {
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(M(this.a));
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(y())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != G) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(C9811tl1.d);
        return sb.toString();
    }

    public Bitmap x() {
        int i = this.a;
        if (i == -1) {
            Object obj = this.b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.b;
        } else {
            if (i == 5) {
                return n((Bitmap) this.b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int y() {
        int i = this.a;
        if (i == -1) {
            return a.c(this.b);
        }
        if (i == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String z() {
        int i = this.a;
        if (i == -1) {
            return a.d(this.b);
        }
        if (i == 2) {
            String str = this.j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.j;
            }
            return ((String) this.b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public IconCompat(int i) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = G;
        this.i = null;
        this.a = i;
    }
}
