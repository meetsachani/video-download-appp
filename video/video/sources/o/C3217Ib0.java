package o;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.text.TextUtils;
import java.io.IOException;

/* renamed from: o.Ib0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3217Ib0 {
    public static final String b = "EncoderFinder";
    public final boolean a;

    public C3217Ib0() {
        boolean z;
        if (((C7575kf1) V20.a(C7575kf1.class)) != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }

    public MediaCodec a(MediaFormat mediaFormat) throws C8279nT0 {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        String b2 = b(mediaFormat, mediaCodecList);
        try {
            if (TextUtils.isEmpty(b2)) {
                String string = mediaFormat.getString("mime");
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(string);
                C7433k41.p(b, String.format("No encoder found that supports requested MediaFormat %s. Create encoder by MIME type. Dump codec info:\n%s", mediaFormat, QV.b(string, createEncoderByType, mediaFormat)));
                return createEncoderByType;
            }
            return MediaCodec.createByCodecName(b2);
        } catch (IOException e) {
            e = e;
            boolean d = d(mediaFormat);
            String e2 = QV.e(mediaCodecList, mediaFormat);
            throw new C8279nT0("Encoder cannot created: " + b2 + ", isMediaFormatInQuirk: " + d + "\n" + e2, e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            boolean d2 = d(mediaFormat);
            String e22 = QV.e(mediaCodecList, mediaFormat);
            throw new C8279nT0("Encoder cannot created: " + b2 + ", isMediaFormatInQuirk: " + d2 + "\n" + e22, e);
        } catch (NullPointerException e4) {
            e = e4;
            boolean d22 = d(mediaFormat);
            String e222 = QV.e(mediaCodecList, mediaFormat);
            throw new C8279nT0("Encoder cannot created: " + b2 + ", isMediaFormatInQuirk: " + d22 + "\n" + e222, e);
        }
    }

    public String b(MediaFormat mediaFormat, MediaCodecList mediaCodecList) {
        Integer num = null;
        try {
            if (this.a && mediaFormat.containsKey("frame-rate")) {
                Integer valueOf = Integer.valueOf(mediaFormat.getInteger("frame-rate"));
                try {
                    mediaFormat.setString("frame-rate", null);
                    num = valueOf;
                } catch (Throwable th) {
                    th = th;
                    num = valueOf;
                    if (num != null) {
                        mediaFormat.setInteger("frame-rate", num.intValue());
                    }
                    throw th;
                }
            }
            String findEncoderForFormat = mediaCodecList.findEncoderForFormat(mediaFormat);
            if (findEncoderForFormat == null) {
                findEncoderForFormat = c(mediaFormat, mediaCodecList.getCodecInfos());
            }
            if (num != null) {
                mediaFormat.setInteger("frame-rate", num.intValue());
            }
            return findEncoderForFormat;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String c(MediaFormat mediaFormat, MediaCodecInfo[] mediaCodecInfoArr) {
        Integer num;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z;
        int i;
        String string = mediaFormat.getString("mime");
        Integer num2 = null;
        if (string == null) {
            C7433k41.p(b, "MediaFormat does not contain mime info.");
            return null;
        }
        int length = mediaCodecInfoArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i2];
            if (mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    boolean z2 = true;
                    if (capabilitiesForType != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C10907yF1.b(z, "MIME type is not supported");
                    if (mediaFormat.containsKey("bitrate")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        if (videoCapabilities == null) {
                            z2 = false;
                        }
                        C10907yF1.b(z2, "Not video codec");
                        num = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                        try {
                            i = videoCapabilities.getBitrateRange().clamp(num).intValue();
                            mediaFormat.setInteger("bitrate", i);
                        } catch (IllegalArgumentException unused) {
                            if (num == null) {
                            }
                            mediaFormat.setInteger("bitrate", num.intValue());
                        } catch (Throwable th) {
                            th = th;
                            num2 = num;
                            if (num2 != null) {
                                mediaFormat.setInteger("bitrate", num2.intValue());
                            }
                            throw th;
                        }
                    } else {
                        i = -1;
                        num = null;
                    }
                } catch (IllegalArgumentException unused2) {
                    num = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                    C7433k41.p(b, String.format("No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]", num, Integer.valueOf(i)));
                    String name = mediaCodecInfo.getName();
                    if (num != null) {
                        mediaFormat.setInteger("bitrate", num.intValue());
                    }
                    return name;
                }
                if (num == null) {
                }
                mediaFormat.setInteger("bitrate", num.intValue());
            }
        }
        return null;
    }

    public final boolean d(MediaFormat mediaFormat) {
        C3719Ne1 c3719Ne1 = (C3719Ne1) V20.a(C3719Ne1.class);
        if (c3719Ne1 == null) {
            return false;
        }
        return c3719Ne1.k(mediaFormat);
    }
}
