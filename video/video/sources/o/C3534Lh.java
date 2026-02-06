package o;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC3240Ih;

/* renamed from: o.Lh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3534Lh implements InterfaceC3240Ih {
    public static final String l = "AudioStreamImpl";
    public final AudioRecord a;
    public final AbstractC8328nh b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicReference<Boolean> e = new AtomicReference<>(null);
    public final int f;
    public final int g;
    public InterfaceC3240Ih.a h;
    public Executor i;
    public long j;
    public AudioManager.AudioRecordingCallback k;

    /* renamed from: o.Lh$a */
    /* loaded from: classes.dex */
    public class a extends AudioManager.AudioRecordingCallback {
        public a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                if (C10983ya.a(audioRecordingConfiguration) == C3534Lh.this.a.getAudioSessionId()) {
                    C3534Lh.this.k(C2613Ca.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public C3534Lh(AbstractC8328nh abstractC8328nh, Context context) throws IllegalArgumentException, InterfaceC3240Ih.b {
        if (j(abstractC8328nh.f(), abstractC8328nh.e(), abstractC8328nh.b())) {
            this.b = abstractC8328nh;
            this.g = abstractC8328nh.d();
            int h = h(abstractC8328nh.f(), abstractC8328nh.e(), abstractC8328nh.b());
            C10907yF1.n(h > 0);
            int i = h * 2;
            this.f = i;
            int i2 = Build.VERSION.SDK_INT;
            AudioFormat build = new AudioFormat.Builder().setSampleRate(abstractC8328nh.f()).setChannelMask(C4021Qh.b(abstractC8328nh.e())).setEncoding(abstractC8328nh.b()).build();
            AudioRecord.Builder b = C10740xa.b();
            if (i2 >= 31 && context != null) {
                C2711Da.c(b, context);
            }
            C10740xa.d(b, abstractC8328nh.c());
            C10740xa.c(b, build);
            C10740xa.e(b, i);
            AudioRecord a2 = C10740xa.a(b);
            this.a = a2;
            if (a2.getState() == 1) {
                return;
            }
            a2.release();
            throw new InterfaceC3240Ih.b("Unable to initialize AudioRecord");
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(abstractC8328nh.f()), Integer.valueOf(abstractC8328nh.e()), Integer.valueOf(abstractC8328nh.b())));
    }

    public static long e(int i, long j, AudioTimestamp audioTimestamp) {
        long c = audioTimestamp.nanoTime + C4021Qh.c(j - audioTimestamp.framePosition, i);
        if (c < 0) {
            return 0L;
        }
        return c;
    }

    public static int h(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, C4021Qh.a(i2), i3);
    }

    public static boolean i() {
        if (V20.a(C3729Nh.class) != null) {
            return true;
        }
        return false;
    }

    public static boolean j(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0 || h(i, i2, i3) <= 0) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC3240Ih
    public void a(InterfaceC3240Ih.a aVar, Executor executor) {
        boolean z = true;
        C10907yF1.o(!this.d.get(), "AudioStream can not be started when setCallback.");
        c();
        if (aVar != null && executor == null) {
            z = false;
        }
        C10907yF1.b(z, "executor can't be null with non-null callback.");
        this.h = aVar;
        this.i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.k;
            if (audioRecordingCallback != null) {
                C2613Ca.d(this.a, audioRecordingCallback);
            }
            if (aVar != null) {
                if (this.k == null) {
                    this.k = new a();
                }
                C2613Ca.c(this.a, executor, this.k);
            }
        }
    }

    public final void c() {
        C10907yF1.o(!this.c.get(), "AudioStream has been released.");
    }

    public final void d() {
        C10907yF1.o(this.d.get(), "AudioStream has not been started.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f() {
        long j;
        if (!i()) {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (C10983ya.b(this.a, audioTimestamp, 0) == 0) {
                j = e(this.b.f(), this.j, audioTimestamp);
                if (j != -1) {
                    return System.nanoTime();
                }
                return j;
            }
            C7433k41.p(l, "Unable to get audio timestamp");
        }
        j = -1;
        if (j != -1) {
        }
    }

    @Override // o.InterfaceC3240Ih
    public void g() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.k) != null) {
            C2613Ca.d(this.a, audioRecordingCallback);
        }
        this.a.release();
    }

    public void k(final boolean z) {
        Executor executor = this.i;
        final InterfaceC3240Ih.a aVar = this.h;
        if (executor != null && aVar != null && !Objects.equals(this.e.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            executor.execute(new Runnable() { // from class: o.Kh
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC3240Ih.a.this.a(z);
                }
            });
        }
    }

    @Override // o.InterfaceC3240Ih
    public InterfaceC3240Ih.c read(ByteBuffer byteBuffer) {
        long j;
        c();
        d();
        int read = this.a.read(byteBuffer, this.f);
        if (read > 0) {
            byteBuffer.limit(read);
            j = f();
            this.j += C4021Qh.f(read, this.g);
        } else {
            j = 0;
        }
        return InterfaceC3240Ih.c.c(read, j);
    }

    @Override // o.InterfaceC3240Ih
    public void start() throws InterfaceC3240Ih.b {
        c();
        boolean z = true;
        if (this.d.getAndSet(true)) {
            return;
        }
        this.a.startRecording();
        boolean z2 = false;
        if (this.a.getRecordingState() == 3) {
            this.j = 0L;
            this.e.set(null);
            if (Build.VERSION.SDK_INT >= 29) {
                AudioRecordingConfiguration a2 = C2613Ca.a(this.a);
                if (a2 == null || !C2613Ca.b(a2)) {
                    z = false;
                }
                z2 = z;
            }
            k(z2);
            return;
        }
        this.d.set(false);
        throw new InterfaceC3240Ih.b("Unable to start AudioRecord with state: " + this.a.getRecordingState());
    }

    @Override // o.InterfaceC3240Ih
    public void stop() {
        c();
        if (this.d.getAndSet(false)) {
            this.a.stop();
            if (this.a.getRecordingState() != 1) {
                C7433k41.p(l, "Failed to stop AudioRecord with state: " + this.a.getRecordingState());
            }
        }
    }
}
