package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;
import o.C2531Be;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final String A1 = "android.media.metadata.MEDIA_URI";
    public static final String B1 = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String C1 = "android.media.metadata.ADVERTISEMENT";
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final String D1 = "android.media.metadata.DOWNLOAD_STATUS";
    public static final int E1 = 0;
    public static final int F1 = 1;
    public static final int G1 = 2;
    public static final int H1 = 3;
    public static final C2531Be<String, Integer> I1;
    public static final String[] J1;
    public static final String[] K1;
    public static final String[] L1;
    public static final String Y0 = "MediaMetadata";
    public static final String Z0 = "android.media.metadata.TITLE";
    public static final String a1 = "android.media.metadata.ARTIST";
    public static final String b1 = "android.media.metadata.DURATION";
    public static final String c1 = "android.media.metadata.ALBUM";
    public static final String d1 = "android.media.metadata.AUTHOR";
    public static final String e1 = "android.media.metadata.WRITER";
    public static final String f1 = "android.media.metadata.COMPOSER";
    public static final String g1 = "android.media.metadata.COMPILATION";
    public static final String h1 = "android.media.metadata.DATE";
    public static final String i1 = "android.media.metadata.YEAR";
    public static final String j1 = "android.media.metadata.GENRE";
    public static final String k1 = "android.media.metadata.TRACK_NUMBER";
    public static final String l1 = "android.media.metadata.NUM_TRACKS";
    public static final String m1 = "android.media.metadata.DISC_NUMBER";
    public static final String n1 = "android.media.metadata.ALBUM_ARTIST";
    public static final String o1 = "android.media.metadata.ART";
    public static final String p1 = "android.media.metadata.ART_URI";
    public static final String q1 = "android.media.metadata.ALBUM_ART";
    public static final String r1 = "android.media.metadata.ALBUM_ART_URI";
    public static final String s1 = "android.media.metadata.USER_RATING";
    public static final String t1 = "android.media.metadata.RATING";
    public static final String u1 = "android.media.metadata.DISPLAY_TITLE";
    public static final String v1 = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String w1 = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String x1 = "android.media.metadata.DISPLAY_ICON";
    public static final String y1 = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String z1 = "android.media.metadata.MEDIA_ID";
    public final Bundle X;
    public MediaMetadata Y;
    public MediaDescriptionCompat Z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C2531Be<String, Integer> c2531Be = new C2531Be<>();
        I1 = c2531Be;
        c2531Be.put(Z0, 1);
        c2531Be.put(a1, 1);
        c2531Be.put(b1, 0);
        c2531Be.put(c1, 1);
        c2531Be.put(d1, 1);
        c2531Be.put(e1, 1);
        c2531Be.put(f1, 1);
        c2531Be.put(g1, 1);
        c2531Be.put(h1, 1);
        c2531Be.put(i1, 0);
        c2531Be.put(j1, 1);
        c2531Be.put(k1, 0);
        c2531Be.put(l1, 0);
        c2531Be.put(m1, 0);
        c2531Be.put(n1, 1);
        c2531Be.put(o1, 2);
        c2531Be.put(p1, 1);
        c2531Be.put(q1, 2);
        c2531Be.put(r1, 1);
        c2531Be.put(s1, 3);
        c2531Be.put(t1, 3);
        c2531Be.put(u1, 1);
        c2531Be.put(v1, 1);
        c2531Be.put(w1, 1);
        c2531Be.put(x1, 2);
        c2531Be.put(y1, 1);
        c2531Be.put(z1, 1);
        c2531Be.put(B1, 0);
        c2531Be.put(A1, 1);
        c2531Be.put("android.media.metadata.ADVERTISEMENT", 0);
        c2531Be.put(D1, 0);
        J1 = new String[]{Z0, a1, c1, n1, e1, d1, f1};
        K1 = new String[]{x1, o1, q1};
        L1 = new String[]{y1, p1, r1};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.X = bundle2;
        MediaSessionCompat.b(bundle2);
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.Y = mediaMetadata;
            return createFromParcel;
        }
        return null;
    }

    public boolean a(String str) {
        return this.X.containsKey(str);
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.X.getParcelable(str);
        } catch (Exception e) {
            Log.w(Y0, "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.X);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.Z;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String k = k(z1);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence m = m(u1);
        if (!TextUtils.isEmpty(m)) {
            charSequenceArr[0] = m;
            charSequenceArr[1] = m(v1);
            charSequenceArr[2] = m(w1);
        } else {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = J1;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence m2 = m(strArr[i2]);
                if (!TextUtils.isEmpty(m2)) {
                    charSequenceArr[i] = m2;
                    i++;
                }
                i2 = i3;
            }
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = K1;
            uri = null;
            if (i4 < strArr2.length) {
                bitmap = c(strArr2[i4]);
                if (bitmap != null) {
                    break;
                }
                i4++;
            } else {
                bitmap = null;
                break;
            }
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = L1;
            if (i5 < strArr3.length) {
                String k2 = k(strArr3[i5]);
                if (!TextUtils.isEmpty(k2)) {
                    uri2 = Uri.parse(k2);
                    break;
                }
                i5++;
            } else {
                uri2 = null;
                break;
            }
        }
        String k3 = k(A1);
        if (!TextUtils.isEmpty(k3)) {
            uri = Uri.parse(k3);
        }
        MediaDescriptionCompat.d dVar = new MediaDescriptionCompat.d();
        dVar.f(k);
        dVar.i(charSequenceArr[0]);
        dVar.h(charSequenceArr[1]);
        dVar.b(charSequenceArr[2]);
        dVar.d(bitmap);
        dVar.e(uri2);
        dVar.g(uri);
        Bundle bundle = new Bundle();
        if (this.X.containsKey(B1)) {
            bundle.putLong(MediaDescriptionCompat.f1, f(B1));
        }
        if (this.X.containsKey(D1)) {
            bundle.putLong(MediaDescriptionCompat.n1, f(D1));
        }
        if (!bundle.isEmpty()) {
            dVar.c(bundle);
        }
        MediaDescriptionCompat a2 = dVar.a();
        this.Z = a2;
        return a2;
    }

    public long f(String str) {
        return this.X.getLong(str, 0L);
    }

    public Object g() {
        if (this.Y == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.Y = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.Y;
    }

    public RatingCompat h(String str) {
        try {
            return RatingCompat.a(this.X.getParcelable(str));
        } catch (Exception e) {
            Log.w(Y0, "Failed to retrieve a key as Rating.", e);
            return null;
        }
    }

    public String k(String str) {
        CharSequence charSequence = this.X.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence m(String str) {
        return this.X.getCharSequence(str);
    }

    public Set<String> n() {
        return this.X.keySet();
    }

    public int o() {
        return this.X.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.X);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final Bundle a;

        public b() {
            this.a = new Bundle();
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }

        public b b(String str, Bitmap bitmap) {
            C2531Be<String, Integer> c2531Be = MediaMetadataCompat.I1;
            if (c2531Be.containsKey(str) && c2531Be.get(str).intValue() != 2) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
            }
            this.a.putParcelable(str, bitmap);
            return this;
        }

        public b c(String str, long j) {
            C2531Be<String, Integer> c2531Be = MediaMetadataCompat.I1;
            if (c2531Be.containsKey(str) && c2531Be.get(str).intValue() != 0) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
            }
            this.a.putLong(str, j);
            return this;
        }

        public b d(String str, RatingCompat ratingCompat) {
            C2531Be<String, Integer> c2531Be = MediaMetadataCompat.I1;
            if (c2531Be.containsKey(str) && c2531Be.get(str).intValue() != 3) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
            }
            this.a.putParcelable(str, (Parcelable) ratingCompat.c());
            return this;
        }

        public b e(String str, String str2) {
            C2531Be<String, Integer> c2531Be = MediaMetadataCompat.I1;
            if (c2531Be.containsKey(str) && c2531Be.get(str).intValue() != 1) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
            }
            this.a.putCharSequence(str, str2);
            return this;
        }

        public b f(String str, CharSequence charSequence) {
            C2531Be<String, Integer> c2531Be = MediaMetadataCompat.I1;
            if (c2531Be.containsKey(str) && c2531Be.get(str).intValue() != 1) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
            }
            this.a.putCharSequence(str, charSequence);
            return this;
        }

        public final Bitmap g(Bitmap bitmap, int i) {
            float f = i;
            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
            return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.X);
            this.a = bundle;
            MediaSessionCompat.b(bundle);
        }

        public b(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.a.keySet()) {
                Object obj = this.a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        b(str, g(bitmap, i));
                    }
                }
            }
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.X = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
