package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import o.C6566gU0;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public static final String e1 = "MediaDescriptionCompat";
    public static final String f1 = "android.media.extra.BT_FOLDER_TYPE";
    public static final long g1 = 0;
    public static final long h1 = 1;
    public static final long i1 = 2;
    public static final long j1 = 3;
    public static final long k1 = 4;
    public static final long l1 = 5;
    public static final long m1 = 6;
    public static final String n1 = "android.media.extra.DOWNLOAD_STATUS";
    public static final long o1 = 0;
    public static final long p1 = 1;
    public static final long q1 = 2;
    public static final String r1 = "android.support.v4.media.description.MEDIA_URI";
    public static final String s1 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public final String X;
    public final CharSequence Y;
    public final CharSequence Y0;
    public final CharSequence Z;
    public final Bitmap Z0;
    public final Uri a1;
    public final Bundle b1;
    public final Uri c1;
    public MediaDescription d1;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public String a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public Bitmap e;
        public Uri f;
        public Bundle g;
        public Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public d b(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f = uri;
            return this;
        }

        public d f(String str) {
            this.a = str;
            return this;
        }

        public d g(Uri uri) {
            this.h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.X = str;
        this.Y = charSequence;
        this.Z = charSequence2;
        this.Y0 = charSequence3;
        this.Z0 = bitmap;
        this.a1 = uri;
        this.b1 = bundle;
        this.c1 = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle d2 = b.d(mediaDescription);
        if (d2 != null) {
            d2 = MediaSessionCompat.G(d2);
        }
        if (d2 != null) {
            uri = (Uri) d2.getParcelable(r1);
        } else {
            uri = null;
        }
        if (uri != null) {
            if (!d2.containsKey(s1) || d2.size() != 2) {
                d2.remove(r1);
                d2.remove(s1);
            }
            dVar.c(bundle);
            if (uri == null) {
                dVar.g(uri);
            } else {
                dVar.g(c.a(mediaDescription));
            }
            MediaDescriptionCompat a2 = dVar.a();
            a2.d1 = mediaDescription;
            return a2;
        }
        bundle = d2;
        dVar.c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat a22 = dVar.a();
        a22.d1 = mediaDescription;
        return a22;
    }

    public CharSequence b() {
        return this.Y0;
    }

    public Bundle c() {
        return this.b1;
    }

    public Bitmap d() {
        return this.Z0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.a1;
    }

    public Object f() {
        MediaDescription mediaDescription = this.d1;
        if (mediaDescription == null) {
            MediaDescription.Builder b2 = b.b();
            b.n(b2, this.X);
            b.p(b2, this.Y);
            b.o(b2, this.Z);
            b.j(b2, this.Y0);
            b.l(b2, this.Z0);
            b.m(b2, this.a1);
            b.k(b2, this.b1);
            c.b(b2, this.c1);
            MediaDescription a2 = b.a(b2);
            this.d1 = a2;
            return a2;
        }
        return mediaDescription;
    }

    public String g() {
        return this.X;
    }

    public Uri h() {
        return this.c1;
    }

    public CharSequence k() {
        return this.Z;
    }

    public CharSequence m() {
        return this.Y;
    }

    public String toString() {
        return ((Object) this.Y) + C6566gU0.h + ((Object) this.Z) + C6566gU0.h + ((Object) this.Y0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) f()).writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.X = parcel.readString();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.Y = (CharSequence) creator.createFromParcel(parcel);
        this.Z = (CharSequence) creator.createFromParcel(parcel);
        this.Y0 = (CharSequence) creator.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.Z0 = (Bitmap) parcel.readParcelable(classLoader);
        this.a1 = (Uri) parcel.readParcelable(classLoader);
        this.b1 = parcel.readBundle(classLoader);
        this.c1 = (Uri) parcel.readParcelable(classLoader);
    }
}
