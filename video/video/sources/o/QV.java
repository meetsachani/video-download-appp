package o;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class QV {
    public static final String a = "DebugUtils";
    public static final String b = "[CodecCaps] ";
    public static final String c = "[VideoCaps] ";
    public static final String d = "[AudioCaps] ";
    public static final String e = "[EncoderCaps] ";

    public static void a(StringBuilder sb, MediaCodecInfo.AudioCapabilities audioCapabilities, MediaFormat mediaFormat) {
        h(sb, "[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
        h(sb, "[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
        if (Build.VERSION.SDK_INT >= 31) {
            h(sb, "[AudioCaps] getMinInputChannelCount = " + C2711Da.b(audioCapabilities));
            h(sb, "[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(C2711Da.a(audioCapabilities)));
        }
        h(sb, "[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        h(sb, "[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            h(sb, "[AudioCaps] isSampleRateSupported for " + integer + " = " + audioCapabilities.isSampleRateSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            h(sb, "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    public static String b(String str, MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            if (capabilitiesForType != null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.a(z);
            c(sb, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            h(sb, C6566gU0.f + mediaCodec.getName() + "] does not support mime " + str);
        }
        return sb.toString();
    }

    public static void c(StringBuilder sb, MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        try {
            h(sb, "[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
        } catch (ClassCastException unused) {
            h(sb, "[CodecCaps] isFormatSupported=false");
        }
        h(sb, "[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb2 = new StringBuilder(C6566gU0.f);
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(m(codecProfileLevel));
            }
            sb2.append(TextUtils.join(C6566gU0.h, arrayList));
            sb2.append(C6566gU0.g);
            h(sb, "[CodecCaps] profileLevels = " + ((Object) sb2));
        }
        if (codecCapabilities.colorFormats != null) {
            h(sb, "[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            f(sb, videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            a(sb, audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            d(sb, encoderCapabilities, mediaFormat);
        }
    }

    public static void d(StringBuilder sb, MediaCodecInfo.EncoderCapabilities encoderCapabilities, MediaFormat mediaFormat) {
        h(sb, "[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
        if (Build.VERSION.SDK_INT >= 28) {
            h(sb, "[EncoderCaps] getQualityRange = " + C2515Ba.a(encoderCapabilities));
        }
        try {
            int integer = mediaFormat.getInteger("bitrate-mode");
            h(sb, "[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            h(sb, "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    public static String e(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        MediaCodecInfo[] codecInfos;
        boolean z;
        StringBuilder sb = new StringBuilder();
        h(sb, "[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
        String string = mediaFormat.getString("mime");
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z2 = true;
                if (string != null) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    C10907yF1.a(z);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z2 = false;
                    }
                    C10907yF1.a(z2);
                    h(sb, "[Start] [" + mediaCodecInfo.getName() + C6566gU0.g);
                    c(sb, capabilitiesForType, mediaFormat);
                    h(sb, "[End] [" + mediaCodecInfo.getName() + C6566gU0.g);
                } catch (IllegalArgumentException unused) {
                    h(sb, C6566gU0.f + mediaCodecInfo.getName() + "] does not support mime " + string);
                }
            }
        }
        h(sb, "[End] Dump MediaCodecList");
        String sb2 = sb.toString();
        l(sb2);
        return sb2;
    }

    public static void f(StringBuilder sb, MediaCodecInfo.VideoCapabilities videoCapabilities, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        h(sb, "[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
        h(sb, "[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
        h(sb, "[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
        int i3 = 0;
        boolean z3 = true;
        try {
            i = mediaFormat.getInteger("width");
            i2 = mediaFormat.getInteger("height");
            if (i > 0 && i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C10907yF1.a(z2);
            z = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            h(sb, "[VideoCaps] mediaFormat does not contain valid width and height");
            i = 0;
            i2 = 0;
            z = false;
        }
        if (z) {
            try {
                h(sb, "[VideoCaps] getSupportedHeightsFor " + i + " = " + videoCapabilities.getSupportedHeightsFor(i));
            } catch (IllegalArgumentException unused2) {
                h(sb, "[VideoCaps] could not getSupportedHeightsFor " + i);
            }
            try {
                h(sb, "[VideoCaps] getSupportedWidthsFor " + i2 + " = " + videoCapabilities.getSupportedWidthsFor(i2));
            } catch (IllegalArgumentException unused3) {
                h(sb, "[VideoCaps] could not getSupportedWidthsFor " + i2);
            }
            h(sb, "[VideoCaps] isSizeSupported for " + i + "x" + i2 + " = " + videoCapabilities.isSizeSupported(i, i2));
        }
        h(sb, "[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
        try {
            int integer = mediaFormat.getInteger("frame-rate");
            if (integer <= 0) {
                z3 = false;
            }
            C10907yF1.a(z3);
            i3 = integer;
        } catch (IllegalArgumentException | NullPointerException unused4) {
            h(sb, "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z) {
            h(sb, "[VideoCaps] getSupportedFrameRatesFor " + i + "x" + i2 + " = " + videoCapabilities.getSupportedFrameRatesFor(i, i2));
        }
        if (z && i3 > 0) {
            h(sb, "[VideoCaps] areSizeAndRateSupported for " + i + "x" + i2 + C6566gU0.h + i3 + " = " + videoCapabilities.areSizeAndRateSupported(i, i2, i3));
        }
    }

    public static String g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, C10997yd1.k3, Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static void h(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("\n");
    }

    public static String i(MediaCodec.BufferInfo bufferInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("Dump BufferInfo: " + bufferInfo.toString() + "\n");
        sb.append("\toffset: " + bufferInfo.offset + "\n");
        sb.append("\tsize: " + bufferInfo.size + "\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\tflag: ");
        sb2.append(bufferInfo.flags);
        sb.append(sb2.toString());
        ArrayList arrayList = new ArrayList();
        if ((bufferInfo.flags & 4) != 0) {
            arrayList.add("EOS");
        }
        if ((bufferInfo.flags & 2) != 0) {
            arrayList.add("CODEC_CONFIG");
        }
        if ((bufferInfo.flags & 1) != 0) {
            arrayList.add("KEY_FRAME");
        }
        if ((bufferInfo.flags & 8) != 0) {
            arrayList.add("PARTIAL_FRAME");
        }
        if (!arrayList.isEmpty()) {
            sb.append(" (");
            sb.append(TextUtils.join(" | ", arrayList));
            sb.append(C9811tl1.d);
        }
        sb.append("\n");
        sb.append("\tpresentationTime: " + bufferInfo.presentationTimeUs + " (" + k(bufferInfo.presentationTimeUs) + ")\n");
        return sb.toString();
    }

    public static String j(long j) {
        return g(j);
    }

    public static String k(long j) {
        return j(TimeUnit.MICROSECONDS.toMillis(j));
    }

    public static void l(String str) {
        if (C7433k41.j(a)) {
            Scanner scanner = new Scanner(str);
            while (scanner.hasNextLine()) {
                C7433k41.f(a, scanner.nextLine());
            }
        }
    }

    public static String m(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        if (codecProfileLevel == null) {
            return "null";
        }
        return String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile));
    }
}
