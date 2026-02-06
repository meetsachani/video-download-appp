package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    @Deprecated
    public static final long A1 = 524288;
    public static final long B1 = 1048576;
    public static final long C1 = 2097152;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public static final long D1 = 4194304;
    public static final int E1 = 0;
    public static final int F1 = 1;
    public static final int G1 = 2;
    public static final int H1 = 3;
    public static final int I1 = 4;
    public static final int J1 = 5;
    public static final int K1 = 6;
    public static final int L1 = 7;
    public static final int M1 = 8;
    public static final int N1 = 9;
    public static final int O1 = 10;
    public static final int P1 = 11;
    public static final long Q1 = -1;
    public static final int R1 = -1;
    public static final int S1 = 0;
    public static final int T1 = 1;
    public static final int U1 = 2;
    public static final int V1 = 3;
    public static final int W1 = -1;
    public static final int X1 = 0;
    public static final int Y1 = 1;
    public static final int Z1 = 2;
    public static final int a2 = 0;
    public static final int b2 = 1;
    public static final int c2 = 2;
    public static final int d2 = 3;
    public static final int e2 = 4;
    public static final int f2 = 5;
    public static final int g2 = 6;
    public static final long h1 = 1;
    public static final int h2 = 7;
    public static final long i1 = 2;
    public static final int i2 = 8;
    public static final long j1 = 4;
    public static final int j2 = 9;
    public static final long k1 = 8;
    public static final int k2 = 10;
    public static final long l1 = 16;
    public static final int l2 = 11;
    public static final long m1 = 32;
    public static final int m2 = 127;
    public static final long n1 = 64;
    public static final int n2 = 126;
    public static final long o1 = 128;
    public static final long p1 = 256;
    public static final long q1 = 512;
    public static final long r1 = 1024;
    public static final long s1 = 2048;
    public static final long t1 = 4096;
    public static final long u1 = 8192;
    public static final long v1 = 16384;
    public static final long w1 = 32768;
    public static final long x1 = 65536;
    public static final long y1 = 131072;
    public static final long z1 = 262144;
    public final int X;
    public final long Y;
    public final float Y0;
    public final long Z;
    public final long Z0;
    public final int a1;
    public final CharSequence b1;
    public final long c1;
    public List<CustomAction> d1;
    public final long e1;
    public final Bundle f1;
    public PlaybackState g1;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        public static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        public static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        public static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        public static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        public static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        public static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        public static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        public static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        public static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        public static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        public static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        public static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        public static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        public static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        public static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        public static void s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        public static void t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        public static void u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        public static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface h {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface i {
    }

    public PlaybackStateCompat(int i3, long j, long j3, float f3, long j4, int i4, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.X = i3;
        this.Y = j;
        this.Z = j3;
        this.Y0 = f3;
        this.Z0 = j4;
        this.a1 = i4;
        this.b1 = charSequence;
        this.c1 = j5;
        this.d1 = new ArrayList(list);
        this.e1 = j6;
        this.f1 = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = c.j(playbackState);
        if (j != null) {
            arrayList = new ArrayList(j.size());
            for (PlaybackState.CustomAction customAction : j) {
                arrayList.add(CustomAction.a(customAction));
            }
        }
        Bundle a3 = d.a(playbackState);
        MediaSessionCompat.b(a3);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(c.r(playbackState), c.q(playbackState), c.i(playbackState), c.p(playbackState), c.g(playbackState), 0, c.k(playbackState), c.n(playbackState), arrayList, c.h(playbackState), a3);
        playbackStateCompat.g1 = playbackState;
        return playbackStateCompat;
    }

    public static int t(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    public long b() {
        return this.Z0;
    }

    public long c() {
        return this.e1;
    }

    public long d() {
        return this.Z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e(Long l) {
        long elapsedRealtime;
        long j = this.Y;
        float f3 = this.Y0;
        if (l != null) {
            elapsedRealtime = l.longValue();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() - this.c1;
        }
        return Math.max(0L, j + (f3 * ((float) elapsedRealtime)));
    }

    public List<CustomAction> f() {
        return this.d1;
    }

    public int g() {
        return this.a1;
    }

    public CharSequence h() {
        return this.b1;
    }

    public Bundle k() {
        return this.f1;
    }

    public long m() {
        return this.c1;
    }

    public float n() {
        return this.Y0;
    }

    public Object o() {
        if (this.g1 == null) {
            PlaybackState.Builder d3 = c.d();
            c.x(d3, this.X, this.Y, this.Y0, this.c1);
            c.u(d3, this.Z);
            c.s(d3, this.Z0);
            c.v(d3, this.b1);
            for (CustomAction customAction : this.d1) {
                c.a(d3, (PlaybackState.CustomAction) customAction.c());
            }
            c.t(d3, this.e1);
            d.b(d3, this.f1);
            this.g1 = c.c(d3);
        }
        return this.g1;
    }

    public long q() {
        return this.Y;
    }

    public int s() {
        return this.X;
    }

    public String toString() {
        return "PlaybackState {state=" + this.X + ", position=" + this.Y + ", buffered position=" + this.Z + ", speed=" + this.Y0 + ", updated=" + this.c1 + ", actions=" + this.Z0 + ", error code=" + this.a1 + ", error message=" + this.b1 + ", custom actions=" + this.d1 + ", active item id=" + this.e1 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.X);
        parcel.writeLong(this.Y);
        parcel.writeFloat(this.Y0);
        parcel.writeLong(this.c1);
        parcel.writeLong(this.Z);
        parcel.writeLong(this.Z0);
        TextUtils.writeToParcel(this.b1, parcel, i3);
        parcel.writeTypedList(this.d1);
        parcel.writeLong(this.e1);
        parcel.writeBundle(this.f1);
        parcel.writeInt(this.a1);
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final List<CustomAction> a;
        public int b;
        public long c;
        public long d;
        public float e;
        public long f;
        public int g;
        public CharSequence h;
        public long i;
        public long j;
        public Bundle k;

        public e() {
            this.a = new ArrayList();
            this.j = -1L;
        }

        public e a(CustomAction customAction) {
            if (customAction != null) {
                this.a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        }

        public e b(String str, String str2, int i) {
            return a(new CustomAction(str, str2, i, null));
        }

        public PlaybackStateCompat c() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }

        public e d(long j) {
            this.f = j;
            return this;
        }

        public e e(long j) {
            this.j = j;
            return this;
        }

        public e f(long j) {
            this.d = j;
            return this;
        }

        public e g(int i, CharSequence charSequence) {
            this.g = i;
            this.h = charSequence;
            return this;
        }

        @Deprecated
        public e h(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public e i(Bundle bundle) {
            this.k = bundle;
            return this;
        }

        public e j(int i, long j, float f) {
            return k(i, j, f, SystemClock.elapsedRealtime());
        }

        public e k(int i, long j, float f, long j2) {
            this.b = i;
            this.c = j;
            this.i = j2;
            this.e = f;
            return this;
        }

        public e(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.j = -1L;
            this.b = playbackStateCompat.X;
            this.c = playbackStateCompat.Y;
            this.e = playbackStateCompat.Y0;
            this.i = playbackStateCompat.c1;
            this.d = playbackStateCompat.Z;
            this.f = playbackStateCompat.Z0;
            this.g = playbackStateCompat.a1;
            this.h = playbackStateCompat.b1;
            List<CustomAction> list = playbackStateCompat.d1;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.j = playbackStateCompat.e1;
            this.k = playbackStateCompat.f1;
        }
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String X;
        public final CharSequence Y;
        public final Bundle Y0;
        public final int Z;
        public PlaybackState.CustomAction Z0;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        /* loaded from: classes.dex */
        public static final class b {
            public final String a;
            public final CharSequence b;
            public final int c;
            public Bundle d;

            public b(String str, CharSequence charSequence, int i) {
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        if (i != 0) {
                            this.a = str;
                            this.b = charSequence;
                            this.c = i;
                            return;
                        }
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
            }

            public CustomAction a() {
                return new CustomAction(this.a, this.b, this.c, this.d);
            }

            public b b(Bundle bundle) {
                this.d = bundle;
                return this;
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.X = str;
            this.Y = charSequence;
            this.Z = i;
            this.Y0 = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj != null) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
                Bundle l = c.l(customAction);
                MediaSessionCompat.b(l);
                CustomAction customAction2 = new CustomAction(c.f(customAction), c.o(customAction), c.m(customAction), l);
                customAction2.Z0 = customAction;
                return customAction2;
            }
            return null;
        }

        public String b() {
            return this.X;
        }

        public Object c() {
            PlaybackState.CustomAction customAction = this.Z0;
            if (customAction == null) {
                PlaybackState.CustomAction.Builder e = c.e(this.X, this.Y, this.Z);
                c.w(e, this.Y0);
                return c.b(e);
            }
            return customAction;
        }

        public Bundle d() {
            return this.Y0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int e() {
            return this.Z;
        }

        public CharSequence f() {
            return this.Y;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.Y) + ", mIcon=" + this.Z + ", mExtras=" + this.Y0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.X);
            TextUtils.writeToParcel(this.Y, parcel, i);
            parcel.writeInt(this.Z);
            parcel.writeBundle(this.Y0);
        }

        public CustomAction(Parcel parcel) {
            this.X = parcel.readString();
            this.Y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.Z = parcel.readInt();
            this.Y0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.X = parcel.readInt();
        this.Y = parcel.readLong();
        this.Y0 = parcel.readFloat();
        this.c1 = parcel.readLong();
        this.Z = parcel.readLong();
        this.Z0 = parcel.readLong();
        this.b1 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d1 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.e1 = parcel.readLong();
        this.f1 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.a1 = parcel.readInt();
    }
}
