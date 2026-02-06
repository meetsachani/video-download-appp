package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public static final String Y0 = "Rating";
    public static final int Z0 = 0;
    public static final int a1 = 1;
    public static final int b1 = 2;
    public static final int c1 = 3;
    public static final int d1 = 4;
    public static final int e1 = 5;
    public static final int f1 = 6;
    public static final float g1 = -1.0f;
    public final int X;
    public final float Y;
    public Object Z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static float a(Rating rating) {
            return rating.getPercentRating();
        }

        public static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float c(Rating rating) {
            return rating.getStarRating();
        }

        public static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        public static boolean e(Rating rating) {
            return rating.isRated();
        }

        public static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating g(boolean z) {
            return Rating.newHeartRating(z);
        }

        public static Rating h(float f) {
            return Rating.newPercentageRating(f);
        }

        public static Rating i(int i, float f) {
            return Rating.newStarRating(i, f);
        }

        public static Rating j(boolean z) {
            return Rating.newThumbRating(z);
        }

        public static Rating k(int i) {
            return Rating.newUnratedRating(i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    public RatingCompat(int i, float f) {
        this.X = i;
        this.Y = f;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b2 = b.b(rating);
            if (b.e(rating)) {
                switch (b2) {
                    case 1:
                        ratingCompat = k(b.d(rating));
                        break;
                    case 2:
                        ratingCompat = o(b.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = n(b2, b.c(rating));
                        break;
                    case 6:
                        ratingCompat = m(b.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = q(b2);
            }
            ratingCompat.Z = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat k(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(1, f);
    }

    public static RatingCompat m(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e(Y0, "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat n(int i, float f) {
        float f2;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    Log.e(Y0, "Invalid rating style (" + i + ") for a star rating");
                    return null;
                }
                f2 = 5.0f;
            } else {
                f2 = 4.0f;
            }
        } else {
            f2 = 3.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e(Y0, "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat o(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(2, f);
    }

    public static RatingCompat q(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public float b() {
        if (this.X == 6 && g()) {
            return this.Y;
        }
        return -1.0f;
    }

    public Object c() {
        if (this.Z == null) {
            if (g()) {
                int i = this.X;
                switch (i) {
                    case 1:
                        this.Z = b.g(f());
                        break;
                    case 2:
                        this.Z = b.j(h());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.Z = b.i(i, e());
                        break;
                    case 6:
                        this.Z = b.h(b());
                        break;
                    default:
                        return null;
                }
            } else {
                this.Z = b.k(this.X);
            }
        }
        return this.Z;
    }

    public int d() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.X;
    }

    public float e() {
        int i = this.X;
        if ((i == 3 || i == 4 || i == 5) && g()) {
            return this.Y;
        }
        return -1.0f;
    }

    public boolean f() {
        if (this.X != 1 || this.Y != 1.0f) {
            return false;
        }
        return true;
    }

    public boolean g() {
        if (this.Y >= 0.0f) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.X != 2 || this.Y != 1.0f) {
            return false;
        }
        return true;
    }

    public String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.X);
        sb.append(" rating=");
        float f = this.Y;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeFloat(this.Y);
    }
}
