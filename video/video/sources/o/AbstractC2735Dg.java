package o;

import android.media.MediaFormat;
import com.google.android.gms.common.Scopes;
import java.util.Objects;
import o.C7342ji;

/* renamed from: o.Dg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2735Dg implements InterfaceC2923Fb0 {

    /* renamed from: o.Dg$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract AbstractC2735Dg a();

        public AbstractC2735Dg b() {
            AbstractC2735Dg a = a();
            if (Objects.equals(a.b(), "audio/mp4a-latm") && a.getProfile() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return a;
        }

        public abstract a c(int i);

        public abstract a d(int i);

        public abstract a e(EnumC5905dp2 enumC5905dp2);

        public abstract a f(String str);

        public abstract a g(int i);

        public abstract a h(int i);
    }

    public static a d() {
        return new C7342ji.b().g(-1);
    }

    @Override // o.InterfaceC2923Fb0
    public MediaFormat a() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(b(), g(), f());
        createAudioFormat.setInteger("bitrate", e());
        if (getProfile() != -1) {
            if (b().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", getProfile());
                return createAudioFormat;
            }
            createAudioFormat.setInteger(Scopes.a, getProfile());
        }
        return createAudioFormat;
    }

    @Override // o.InterfaceC2923Fb0
    public abstract String b();

    @Override // o.InterfaceC2923Fb0
    public abstract EnumC5905dp2 c();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    @Override // o.InterfaceC2923Fb0
    public abstract int getProfile();
}
