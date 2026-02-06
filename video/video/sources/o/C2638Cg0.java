package o;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.media.AudioAttributesCompat;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import o.C2834Eg0;
import o.InterfaceC8148mw2;
import okhttp3.internal.ws.WebSocketProtocol;

/* renamed from: o.Cg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2638Cg0 {
    public static final String A = "Compression";
    public static final String A0 = "OECF";
    public static final String A1 = "GPSLongitudeRef";
    public static final String A2 = "CameraSettingsIFDPointer";
    public static final short A3 = 9;
    public static final short A4 = 2;
    public static final int A5 = 0;
    public static final int A6 = 9;
    public static final byte A7 = -49;
    public static final String B = "PhotometricInterpretation";
    public static final String B0 = "SensitivityType";
    public static final String B1 = "GPSLongitude";
    public static final String B2 = "ImageProcessingIFDPointer";
    public static final short B3 = 10;
    public static final short B4 = 3;
    public static final int B5 = 1;
    public static final int B6 = 10;
    public static final byte B7 = -38;
    public static final String C = "Orientation";
    public static final String C0 = "StandardOutputSensitivity";
    public static final String C1 = "GPSAltitudeRef";
    public static final int C2 = 512;
    public static final short C3 = 11;
    public static final short C4 = 4;
    public static final int C5 = 5000;
    public static final int C6 = 11;
    public static final byte C7 = -31;
    public static final String D = "SamplesPerPixel";
    public static final String D0 = "RecommendedExposureIndex";
    public static final String D1 = "GPSAltitude";
    public static final int D2 = 0;
    public static final short D3 = 12;
    public static final short D4 = 0;
    public static final int D6 = 12;
    public static final byte D7 = -2;
    public static final String E = "PlanarConfiguration";
    public static final String E0 = "ISOSpeed";
    public static final String E1 = "GPSTimeStamp";
    public static final int E2 = 1;
    public static final short E3 = 13;
    public static final short E4 = 1;
    public static final String E5 = "FUJIFILMCCD-RAW";
    public static final int E6 = 13;
    public static final byte E7 = -39;
    public static final String F = "YCbCrSubSampling";
    public static final String F0 = "ISOSpeedLatitudeyyy";
    public static final String F1 = "GPSSatellites";
    public static final int F2 = 2;
    public static final short F3 = 14;
    public static final short F4 = 2;
    public static final int F5 = 84;
    public static final int F6 = 8192;
    public static final int F7 = 0;
    public static final String G = "YCbCrPositioning";
    public static final String G0 = "ISOSpeedLatitudezzz";
    public static final String G1 = "GPSStatus";
    public static final int G2 = 3;
    public static final short G3 = 15;
    public static final short G4 = 0;
    public static final int G7 = 1;
    public static final String H = "XResolution";
    public static final String H0 = "ShutterSpeedValue";
    public static final String H1 = "GPSMeasureMode";
    public static final int H2 = 4;
    public static final short H3 = 16;
    public static final short H4 = 0;
    public static final int H7 = 2;
    public static final String I = "YResolution";
    public static final String I0 = "ApertureValue";
    public static final String I1 = "GPSDOP";
    public static final int I2 = 5;
    public static final short I3 = 17;
    public static final short I4 = 0;
    public static final int I7 = 3;
    public static final String J = "ResolutionUnit";
    public static final String J0 = "BrightnessValue";
    public static final String J1 = "GPSSpeedRef";
    public static final int J2 = 6;
    public static final short J3 = 18;
    public static final short J4 = 0;
    public static final short J5 = 20306;
    public static final f[] J6;
    public static final int J7 = 4;
    public static final String K = "StripOffsets";
    public static final String K0 = "ExposureBiasValue";
    public static final String K1 = "GPSSpeed";
    public static final int K2 = 7;
    public static final short K3 = 19;
    public static final short K4 = 1;
    public static final short K5 = 21330;
    public static final f[] K6;
    public static final int K7 = 5;
    public static final String L = "RowsPerStrip";
    public static final String L0 = "MaxApertureValue";
    public static final String L1 = "GPSTrackRef";
    public static final int L2 = 8;
    public static final short L3 = 20;
    public static final short L4 = 2;
    public static final f[] L6;
    public static final int L7 = 6;
    public static final String M = "StripByteCounts";
    public static final String M0 = "SubjectDistance";
    public static final String M1 = "GPSTrack";
    public static final short M3 = 21;
    public static final short M4 = 0;
    public static final f[] M6;
    public static final int M7 = 7;
    public static final String N = "JPEGInterchangeFormat";
    public static final String N0 = "MeteringMode";
    public static final String N1 = "GPSImgDirectionRef";
    public static final short N3 = 22;
    public static final short N4 = 1;
    public static final int N5 = 8;
    public static final f[] N6;
    public static final int N7 = 8;
    public static final String O = "JPEGInterchangeFormatLength";
    public static final String O0 = "LightSource";
    public static final String O1 = "GPSImgDirection";
    public static final short O2 = 1;
    public static final short O3 = 23;
    public static final short O4 = 2;
    public static final int O5 = 12;
    public static final f O6;
    public static final int O7 = 9;
    public static final String P = "TransferFunction";
    public static final String P0 = "Flash";
    public static final String P1 = "GPSMapDatum";
    public static final short P2 = 2;
    public static final short P3 = 24;
    public static final short P4 = 3;
    public static final short P5 = 85;
    public static final f[] P6;
    public static final int P7 = 10;
    public static final String Q = "WhitePoint";
    public static final String Q0 = "SubjectArea";
    public static final String Q1 = "GPSDestLatitudeRef";
    public static final short Q2 = 1;
    public static final short Q3 = 255;
    public static final String Q4 = "N";
    public static final String Q5 = "PENTAX";
    public static final f[] Q6;
    public static final int Q7 = 11;
    public static final String R = "PrimaryChromaticities";
    public static final String R0 = "FocalLength";
    public static final String R1 = "GPSDestLatitude";
    public static final short R2 = 2;
    public static final short R3 = 1;
    public static final String R4 = "S";
    public static final int R5 = 6;
    public static final f[] R6;
    public static final int R7 = 12;
    public static final String S = "YCbCrCoefficients";
    public static final String S0 = "FlashEnergy";
    public static final String S1 = "GPSDestLongitudeRef";
    public static final short S2 = 2;
    public static final short S3 = 4;
    public static final String S4 = "E";
    public static final f[] S6;
    public static final int S7 = 13;
    public static final String T = "ReferenceBlackWhite";
    public static final String T0 = "SpatialFrequencyResponse";
    public static final String T1 = "GPSDestLongitude";
    public static final short T2 = 3;
    public static final short T3 = 6;
    public static final String T4 = "W";
    public static final int T6 = 0;
    public static final int T7 = 14;
    public static final String U = "DateTime";
    public static final String U0 = "FocalPlaneXResolution";
    public static final String U1 = "GPSDestBearingRef";
    public static final int U2 = 1;
    public static final short U3 = 8;
    public static final short U4 = 0;
    public static final int U6 = 1;
    public static final Pattern U7;
    public static final String V = "ImageDescription";
    public static final String V0 = "FocalPlaneYResolution";
    public static final String V1 = "GPSDestBearing";
    public static final int V2 = 65535;
    public static final short V3 = 16;
    public static final short V4 = 1;
    public static final int V6 = 2;
    public static final Pattern V7;
    public static final String W = "Make";
    public static final String W0 = "FocalPlaneResolutionUnit";
    public static final String W1 = "GPSDestDistanceRef";
    public static final short W2 = 0;
    public static final short W3 = 24;
    public static final String W4 = "A";
    public static final int W5 = 4;
    public static final int W6 = 3;
    public static final Pattern W7;
    public static final String X = "Model";
    public static final String X0 = "SubjectLocation";
    public static final String X1 = "GPSDestDistance";
    public static final short X2 = 1;
    public static final short X3 = 32;
    public static final String X4 = "V";
    public static final int X5 = 4;
    public static final int X6 = 4;
    public static final Pattern X7;
    public static final String Y = "Software";
    public static final String Y0 = "ExposureIndex";
    public static final String Y1 = "GPSProcessingMethod";
    public static final short Y2 = 2;
    public static final short Y3 = 64;
    public static final String Y4 = "2";
    public static final int Y6 = 5;
    public static final int Y7 = 19;
    public static final String Z = "Artist";
    public static final String Z0 = "SensingMethod";
    public static final String Z1 = "GPSAreaInformation";
    public static final short Z2 = 3;
    public static final short Z3 = 1;
    public static final String Z4 = "3";
    public static final int Z6 = 6;
    public static final String a0 = "Copyright";
    public static final String a1 = "FileSource";
    public static final String a2 = "GPSDateStamp";
    public static final short a3 = 4;
    public static final short a4 = 2;
    public static final String a5 = "K";
    public static final int a6 = 4;
    public static final int a7 = 7;
    public static final String b0 = "ExifVersion";
    public static final String b1 = "SceneType";
    public static final String b2 = "GPSDifferential";
    public static final short b3 = 5;
    public static final short b4 = 3;
    public static final String b5 = "M";
    public static final int b7 = 8;
    public static final String c0 = "FlashpixVersion";
    public static final String c1 = "CFAPattern";
    public static final String c2 = "GPSHPositioningError";
    public static final short c3 = 6;
    public static final short c4 = 4;
    public static final String c5 = "N";
    public static final int c7 = 9;
    public static final String d0 = "ColorSpace";
    public static final String d1 = "CustomRendered";
    public static final String d2 = "InteroperabilityIndex";
    public static final short d3 = 7;
    public static final short d4 = 5;
    public static final String d5 = "T";
    public static final byte d6 = 47;
    public static final f[][] d7;
    public static final String e0 = "Gamma";
    public static final String e1 = "ExposureMode";
    public static final String e2 = "ThumbnailImageLength";
    public static final short e3 = 8;
    public static final short e4 = 7;
    public static final String e5 = "M";
    public static final f[] e7;
    public static final String f0 = "PixelXDimension";
    public static final String f1 = "WhiteBalance";
    public static final String f2 = "ThumbnailImageWidth";
    public static final short f3 = 0;
    public static final short f4 = 8;
    public static final String f5 = "K";
    public static final HashMap<Integer, f>[] f7;
    public static final String g0 = "PixelYDimension";
    public static final String g1 = "DigitalZoomRatio";
    public static final String g2 = "ThumbnailOrientation";
    public static final short g3 = 1;
    public static final short g4 = 0;
    public static final String g5 = "M";
    public static final HashMap<String, f>[] g7;
    public static final String h0 = "ComponentsConfiguration";
    public static final String h1 = "FocalLengthIn35mmFilm";
    public static final String h2 = "DNGVersion";
    public static final short h3 = 2;
    public static final short h4 = 1;
    public static final String h5 = "N";
    public static final HashSet<String> h7;
    public static final String i0 = "CompressedBitsPerPixel";
    public static final String i1 = "SceneCaptureType";
    public static final String i2 = "DefaultCropSize";
    public static final short i3 = 3;
    public static final short i4 = 2;
    public static final short i5 = 0;
    public static final HashMap<Integer, Integer> i7;
    public static final String j0 = "MakerNote";
    public static final String j1 = "GainControl";
    public static final String j2 = "ThumbnailImage";
    public static final short j3 = 4;
    public static final short j4 = 3;
    public static final short j5 = 1;
    public static final int j6 = 10;
    public static final Charset j7;
    public static final String k0 = "UserComment";
    public static final String k1 = "Contrast";
    public static final String k2 = "PreviewImageStart";
    public static final short k3 = 5;
    public static final short k4 = 1;
    public static final int k5 = 1;
    public static final int k6 = 4;
    public static final byte[] k7;
    public static final String l0 = "RelatedSoundFile";
    public static final String l1 = "Saturation";
    public static final String l2 = "PreviewImageLength";
    public static final short l3 = 6;
    public static final short l4 = 0;
    public static final int l5 = 2;
    public static final int l6 = 4;
    public static final byte[] l7;
    public static final String m0 = "DateTimeOriginal";
    public static final String m1 = "Sharpness";
    public static final String m2 = "AspectFrame";
    public static final short m3 = 7;
    public static final short m4 = 1;
    public static final int m5 = 6;
    public static SimpleDateFormat m6 = null;
    public static final byte m7 = -1;
    public static final String n0 = "DateTimeDigitized";
    public static final String n1 = "DeviceSettingDescription";
    public static final String n2 = "SensorBottomBorder";
    public static final short n3 = 0;
    public static final short n4 = 0;
    public static final int n5 = 7;
    public static SimpleDateFormat n6 = null;
    public static final String o0 = "OffsetTime";
    public static final String o1 = "SubjectDistanceRange";
    public static final String o2 = "SensorLeftBorder";
    public static final short o3 = 1;
    public static final short o4 = 1;
    public static final int o5 = 8;
    public static final short o6 = 18761;
    public static final byte o7 = -64;
    public static final String p0 = "OffsetTimeOriginal";
    public static final String p1 = "ImageUniqueID";
    public static final String p2 = "SensorRightBorder";
    public static final short p3 = 2;
    public static final short p4 = 2;
    public static final int p5 = 32773;
    public static final short p6 = 19789;
    public static final byte p7 = -63;
    public static final String q0 = "OffsetTimeDigitized";
    @Deprecated
    public static final String q1 = "CameraOwnerName";
    public static final String q2 = "SensorTopBorder";
    public static final short q3 = 3;
    @Deprecated
    public static final int q4 = 0;
    public static final int q5 = 34892;
    public static final byte q6 = 42;
    public static final byte q7 = -62;
    public static final String r0 = "SubSecTime";
    public static final String r1 = "CameraOwnerName";
    public static final String r2 = "ISO";
    public static final short r3 = 4;
    @Deprecated
    public static final int r4 = 1;
    public static final int r6 = 8;
    public static final byte r7 = -61;
    public static final String s0 = "SubSecTimeOriginal";
    public static final String s1 = "BodySerialNumber";
    public static final String s2 = "JpgFromRaw";
    public static final short s3 = 5;
    public static final short s4 = 0;
    public static final int s6 = 1;
    public static final byte s7 = -59;
    public static final String t0 = "SubSecTimeDigitized";
    public static final String t1 = "LensSpecification";
    public static final String t2 = "Xmp";
    public static final short t3 = 6;
    public static final short t4 = 1;
    public static final int t6 = 2;
    public static final byte t7 = -58;
    public static final String u0 = "ExposureTime";
    public static final String u1 = "LensMake";
    public static final String u2 = "NewSubfileType";
    public static final short u3 = 255;
    public static final short u4 = 0;
    public static final int u5 = 0;
    public static final int u6 = 3;
    public static final byte u7 = -57;
    public static final String v0 = "FNumber";
    public static final String v1 = "LensModel";
    public static final String v2 = "SubfileType";
    public static final short v3 = 0;
    public static final short v4 = 1;
    public static final int v5 = 1;
    public static final int v6 = 4;
    public static final byte v7 = -55;
    public static final String w0 = "ExposureProgram";
    public static final String w1 = "LensSerialNumber";
    public static final String w2 = "ExifIFDPointer";
    public static final short w3 = 1;
    public static final short w4 = 2;
    public static final int w5 = 2;
    public static final int w6 = 5;
    public static final byte w7 = -54;
    public static final String x = "ImageWidth";
    public static final String x0 = "SpectralSensitivity";
    public static final String x1 = "GPSVersionID";
    public static final String x2 = "GPSInfoIFDPointer";
    public static final short x3 = 2;
    public static final short x4 = 3;
    public static final int x5 = 6;
    public static final int x6 = 6;
    public static final byte x7 = -53;
    public static final String y = "ImageLength";
    @Deprecated
    public static final String y0 = "ISOSpeedRatings";
    public static final String y1 = "GPSLatitudeRef";
    public static final String y2 = "InteroperabilityIFDPointer";
    public static final short y3 = 3;
    public static final short y4 = 0;
    public static final int y5 = 0;
    public static final int y6 = 7;
    public static final byte y7 = -51;
    public static final String z = "BitsPerSample";
    public static final String z0 = "PhotographicSensitivity";
    public static final String z1 = "GPSLatitude";
    public static final String z2 = "SubIFDPointer";
    public static final short z3 = 4;
    public static final short z4 = 1;
    public static final int z5 = 1;
    public static final int z6 = 8;
    public static final byte z7 = -50;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public boolean e;
    public final HashMap<String, d>[] f;
    public Set<Integer> g;
    public ByteOrder h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public byte[] n;

    /* renamed from: o  reason: collision with root package name */
    public int f432o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public static final String v = "ExifInterface";
    public static final boolean w = Log.isLoggable(v, 3);
    public static final List<Integer> M2 = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> N2 = Arrays.asList(2, 7, 4, 5);
    public static final int[] r5 = {8, 8, 8};
    public static final int[] s5 = {4};
    public static final int[] t5 = {8};
    public static final byte n7 = -40;
    public static final byte[] D5 = {-1, n7, -1};
    public static final byte[] G5 = {102, 116, 121, 112};
    public static final byte[] H5 = {109, 105, 102, 49};
    public static final byte[] I5 = {104, 101, 105, 99};
    public static final byte[] L5 = {79, 76, 89, 77, 80, 0};
    public static final byte[] M5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] S5 = {-119, 80, 78, 71, 13, 10, C8077mf.D, 10};
    public static final byte[] T5 = {101, 88, 73, 102};
    public static final byte[] U5 = {73, 72, 68, 82};
    public static final byte[] V5 = {73, 69, 78, 68};
    public static final byte[] Y5 = {82, 73, 70, 70};
    public static final byte[] Z5 = {87, 69, 66, 80};
    public static final byte[] b6 = {69, 88, 73, 70};
    public static final byte[] c6 = {-99, 1, 42};
    public static final byte[] e6 = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] f6 = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] g6 = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] h6 = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] i6 = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] G6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] H6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] I6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: o.Cg0$b */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {
        public static final ByteOrder Z0 = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder a1 = ByteOrder.BIG_ENDIAN;
        public final DataInputStream X;
        public ByteOrder Y;
        public byte[] Y0;
        public int Z;

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.Z;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.X.available();
        }

        public long d() throws IOException {
            return readInt() & 4294967295L;
        }

        public void f(ByteOrder byteOrder) {
            this.Y = byteOrder;
        }

        public void h(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.X.skip(i3);
                if (skip <= 0) {
                    if (this.Y0 == null) {
                        this.Y0 = new byte[8192];
                    }
                    skip = this.X.read(this.Y0, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.Z += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.Z++;
            return this.X.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.Z++;
            return this.X.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.Z++;
            int read = this.X.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.Z += 2;
            return this.X.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.Z += i2;
            this.X.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.Z += 4;
            int read = this.X.read();
            int read2 = this.X.read();
            int read3 = this.X.read();
            int read4 = this.X.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.Y;
                if (byteOrder == Z0) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == a1) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.Y);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(C2638Cg0.v, "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.Z += 8;
            int read = this.X.read();
            int read2 = this.X.read();
            int read3 = this.X.read();
            int read4 = this.X.read();
            int read5 = this.X.read();
            int read6 = this.X.read();
            int read7 = this.X.read();
            int read8 = this.X.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.Y;
                if (byteOrder == Z0) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == a1) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.Y);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.Z += 2;
            int read = this.X.read();
            int read2 = this.X.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.Y;
                if (byteOrder == Z0) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == a1) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.Y);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.Z += 2;
            return this.X.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.Z++;
            return this.X.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.Z += 2;
            int read = this.X.read();
            int read2 = this.X.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.Y;
                if (byteOrder == Z0) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == a1) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.Y);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.Y = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.X = dataInputStream;
            dataInputStream.mark(0);
            this.Z = 0;
            this.Y = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.X.read(bArr, i, i2);
            this.Z += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.Z += bArr.length;
            this.X.readFully(bArr);
        }
    }

    /* renamed from: o.Cg0$c */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {
        public final OutputStream X;
        public ByteOrder Y;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.X = outputStream;
            this.Y = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.Y = byteOrder;
        }

        public void d(int i) throws IOException {
            this.X.write(i);
        }

        public void f(int i) throws IOException {
            ByteOrder byteOrder = this.Y;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.X.write(i & 255);
                this.X.write((i >>> 8) & 255);
                this.X.write((i >>> 16) & 255);
                this.X.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.X.write((i >>> 24) & 255);
                this.X.write((i >>> 16) & 255);
                this.X.write((i >>> 8) & 255);
                this.X.write(i & 255);
            }
        }

        public void h(short s) throws IOException {
            ByteOrder byteOrder = this.Y;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.X.write(s & 255);
                this.X.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.X.write((s >>> 8) & 255);
                this.X.write(s & 255);
            }
        }

        public void i(long j) throws IOException {
            f((int) j);
        }

        public void j(int i) throws IOException {
            h((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.X.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.X.write(bArr, i, i2);
        }
    }

    /* renamed from: o.Cg0$d */
    /* loaded from: classes.dex */
    public static class d {
        public static final long e = -1;
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        public d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - C3599Ly1.j)});
            }
            byte[] bytes = str.getBytes(C2638Cg0.j7);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double d, ByteOrder byteOrder) {
            return c(new double[]{d}, byteOrder);
        }

        public static d c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2638Cg0.H6[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d d(int i, ByteOrder byteOrder) {
            return e(new int[]{i}, byteOrder);
        }

        public static d e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2638Cg0.H6[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d f(h hVar, ByteOrder byteOrder) {
            return g(new h[]{hVar}, byteOrder);
        }

        public static d g(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2638Cg0.H6[10] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.a);
                wrap.putInt((int) hVar.b);
            }
            return new d(10, hVarArr.length, wrap.array());
        }

        public static d h(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C2638Cg0.j7);
            return new d(2, bytes.length, bytes);
        }

        public static d i(long j, ByteOrder byteOrder) {
            return j(new long[]{j}, byteOrder);
        }

        public static d j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2638Cg0.H6[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d k(h hVar, ByteOrder byteOrder) {
            return l(new h[]{hVar}, byteOrder);
        }

        public static d l(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2638Cg0.H6[5] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.a);
                wrap.putInt((int) hVar.b);
            }
            return new d(5, hVarArr.length, wrap.array());
        }

        public static d m(int i, ByteOrder byteOrder) {
            return n(new int[]{i}, byteOrder);
        }

        public static d n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2638Cg0.H6[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double o(ByteOrder byteOrder) {
            Object r = r(byteOrder);
            if (r != null) {
                if (r instanceof String) {
                    return Double.parseDouble((String) r);
                }
                if (r instanceof long[]) {
                    long[] jArr = (long[]) r;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof int[]) {
                    int[] iArr = (int[]) r;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof double[]) {
                    double[] dArr = (double[]) r;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof h[]) {
                    h[] hVarArr = (h[]) r;
                    if (hVarArr.length == 1) {
                        return hVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int p(ByteOrder byteOrder) {
            Object r = r(byteOrder);
            if (r != null) {
                if (r instanceof String) {
                    return Integer.parseInt((String) r);
                }
                if (r instanceof long[]) {
                    long[] jArr = (long[]) r;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof int[]) {
                    int[] iArr = (int[]) r;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String q(ByteOrder byteOrder) {
            Object r = r(byteOrder);
            if (r == null) {
                return null;
            }
            if (r instanceof String) {
                return (String) r;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (r instanceof long[]) {
                long[] jArr = (long[]) r;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (r instanceof int[]) {
                int[] iArr = (int[]) r;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (r instanceof double[]) {
                double[] dArr = (double[]) r;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(r instanceof h[])) {
                return null;
            } else {
                h[] hVarArr = (h[]) r;
                while (i < hVarArr.length) {
                    sb.append(hVarArr[i].a);
                    sb.append('/');
                    sb.append(hVarArr[i].b);
                    i++;
                    if (i != hVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:18:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:114:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v20, types: [int[]] */
        /* JADX WARN: Type inference failed for: r11v22, types: [long[]] */
        /* JADX WARN: Type inference failed for: r11v24, types: [o.Cg0$h[]] */
        /* JADX WARN: Type inference failed for: r11v26, types: [int[]] */
        /* JADX WARN: Type inference failed for: r11v28, types: [int[]] */
        /* JADX WARN: Type inference failed for: r11v30, types: [o.Cg0$h[]] */
        /* JADX WARN: Type inference failed for: r11v32, types: [double[]] */
        /* JADX WARN: Type inference failed for: r11v35, types: [double[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object r(ByteOrder byteOrder) {
            b bVar;
            InputStream inputStream;
            byte b;
            byte b2;
            String str;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.d);
                } catch (IOException e2) {
                    e = e2;
                    bVar = null;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream2 != null) {
                    }
                    throw th;
                }
                try {
                    bVar.f(byteOrder);
                    int i = 0;
                    switch (this.a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.d;
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                str = new String(new char[]{(char) (b + 48)});
                                break;
                            } else {
                                String str2 = new String(bArr, C2638Cg0.j7);
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e3) {
                                    Log.e(C2638Cg0.v, "IOException occurred while closing InputStream", e3);
                                    return str2;
                                }
                            }
                            break;
                        case 2:
                        case 7:
                            if (this.b >= C2638Cg0.I6.length) {
                                int i2 = 0;
                                while (true) {
                                    byte[] bArr2 = C2638Cg0.I6;
                                    if (i2 < bArr2.length) {
                                        if (this.d[i2] == bArr2[i2]) {
                                            i2++;
                                        }
                                    } else {
                                        i = bArr2.length;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i < this.b && (b2 = this.d[i]) != 0) {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            str = sb.toString();
                            break;
                        case 3:
                            ?? r11 = new int[this.b];
                            while (true) {
                                str = r11;
                                if (i < this.b) {
                                    r11[i] = bVar.readUnsignedShort();
                                    i++;
                                }
                            }
                            break;
                        case 4:
                            ?? r112 = new long[this.b];
                            while (true) {
                                str = r112;
                                if (i < this.b) {
                                    r112[i] = bVar.d();
                                    i++;
                                }
                            }
                            break;
                        case 5:
                            ?? r113 = new h[this.b];
                            while (true) {
                                str = r113;
                                if (i < this.b) {
                                    r113[i] = new h(bVar.d(), bVar.d());
                                    i++;
                                }
                            }
                            break;
                        case 8:
                            ?? r114 = new int[this.b];
                            while (true) {
                                str = r114;
                                if (i < this.b) {
                                    r114[i] = bVar.readShort();
                                    i++;
                                }
                            }
                            break;
                        case 9:
                            ?? r115 = new int[this.b];
                            while (true) {
                                str = r115;
                                if (i < this.b) {
                                    r115[i] = bVar.readInt();
                                    i++;
                                }
                            }
                            break;
                        case 10:
                            ?? r116 = new h[this.b];
                            while (true) {
                                str = r116;
                                if (i < this.b) {
                                    r116[i] = new h(bVar.readInt(), bVar.readInt());
                                    i++;
                                }
                            }
                            break;
                        case 11:
                            ?? r117 = new double[this.b];
                            while (true) {
                                str = r117;
                                if (i < this.b) {
                                    r117[i] = bVar.readFloat();
                                    i++;
                                }
                            }
                            break;
                        case 12:
                            ?? r118 = new double[this.b];
                            while (true) {
                                str = r118;
                                if (i < this.b) {
                                    r118[i] = bVar.readDouble();
                                    i++;
                                }
                            }
                            break;
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e(C2638Cg0.v, "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                    try {
                        bVar.close();
                        return str;
                    } catch (IOException e5) {
                        Log.e(C2638Cg0.v, "IOException occurred while closing InputStream", e5);
                        return str;
                    }
                } catch (IOException e6) {
                    e = e6;
                    Log.w(C2638Cg0.v, "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e7) {
                            Log.e(C2638Cg0.v, "IOException occurred while closing InputStream", e7);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e8) {
                        Log.e(C2638Cg0.v, "IOException occurred while closing InputStream", e8);
                    }
                }
                throw th;
            }
        }

        public int s() {
            return C2638Cg0.H6[this.a] * this.b;
        }

        public String toString() {
            return C9811tl1.c + C2638Cg0.G6[this.a] + ", data length:" + this.d.length + C9811tl1.d;
        }

        public d(int i, int i2, long j, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Cg0$e */
    /* loaded from: classes.dex */
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Cg0$g */
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* renamed from: o.Cg0$h */
    /* loaded from: classes.dex */
    public static class h {
        public final long a;
        public final long b;

        public h(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        public double a() {
            return this.a / this.b;
        }

        public String toString() {
            return this.a + RemoteSettings.i + this.b;
        }

        public h(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = j;
            this.b = j2;
        }
    }

    static {
        f[] fVarArr;
        f[] fVarArr2 = {new f(u2, C9680tD0.l, 4), new f(v2, 255, 4), new f(x, 256, 3, 4), new f(y, 257, 3, 4), new f(z, 258, 3), new f(A, 259, 3), new f(B, 262, 3), new f(V, C4731Xo.d1, 2), new f(W, 271, 2), new f(X, 272, 2), new f(K, AudioAttributesCompat.O, 3, 4), new f(C, C9276rZ.q, 3), new f(D, 277, 3), new f(L, 278, 3, 4), new f(M, 279, 3, 4), new f(H, 282, 5), new f(I, 283, 5), new f(E, 284, 3), new f(J, 296, 3), new f(P, 301, 3), new f(Y, 305, 2), new f(U, 306, 2), new f(Z, 315, 2), new f(Q, InterfaceC8148mw2.a.s, 5), new f(R, 319, 5), new f("SubIFDPointer", 330, 4), new f(N, C6793hQ0.j, 4), new f(O, 514, 4), new f(S, 529, 5), new f(F, 530, 3), new f(G, 531, 3), new f(T, 532, 5), new f(a0, 33432, 2), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f(q2, 4, 4), new f(o2, 5, 4), new f(n2, 6, 4), new f(p2, 7, 4), new f(r2, 23, 3), new f(s2, 46, 7), new f(t2, 700, 1)};
        J6 = fVarArr2;
        f[] fVarArr3 = {new f(u0, 33434, 5), new f(v0, 33437, 5), new f(w0, 34850, 3), new f(x0, 34852, 2), new f(z0, 34855, 3), new f(A0, 34856, 7), new f(B0, 34864, 3), new f(C0, 34865, 4), new f(D0, 34866, 4), new f(E0, 34867, 4), new f(F0, 34868, 4), new f(G0, 34869, 4), new f(b0, 36864, 2), new f(m0, 36867, 2), new f(n0, 36868, 2), new f(o0, 36880, 2), new f(p0, 36881, 2), new f(q0, 36882, 2), new f(h0, 37121, 7), new f(i0, 37122, 5), new f(H0, 37377, 10), new f(I0, 37378, 5), new f(J0, 37379, 10), new f(K0, 37380, 10), new f(L0, 37381, 5), new f(M0, 37382, 5), new f(N0, 37383, 3), new f(O0, 37384, 3), new f(P0, 37385, 3), new f(R0, 37386, 5), new f(Q0, 37396, 3), new f(j0, 37500, 7), new f(k0, 37510, 7), new f(r0, 37520, 2), new f(s0, 37521, 2), new f(t0, 37522, 2), new f(c0, 40960, 7), new f(d0, 40961, 3), new f(f0, 40962, 3, 4), new f(g0, 40963, 3, 4), new f(l0, 40964, 2), new f("InteroperabilityIFDPointer", 40965, 4), new f(S0, 41483, 5), new f(T0, 41484, 7), new f(U0, 41486, 5), new f(V0, 41487, 5), new f(W0, 41488, 3), new f(X0, 41492, 3), new f(Y0, 41493, 5), new f(Z0, 41495, 3), new f(a1, 41728, 7), new f(b1, 41729, 7), new f(c1, 41730, 7), new f(d1, 41985, 3), new f(e1, 41986, 3), new f(f1, 41987, 3), new f(g1, 41988, 5), new f(h1, 41989, 3), new f(i1, 41990, 3), new f(j1, 41991, 3), new f(k1, 41992, 3), new f(l1, 41993, 3), new f(m1, 41994, 3), new f(n1, 41995, 7), new f(o1, 41996, 3), new f(p1, 42016, 2), new f("CameraOwnerName", 42032, 2), new f(s1, 42033, 2), new f(t1, 42034, 5), new f(u1, 42035, 2), new f(v1, 42036, 2), new f(e0, 42240, 5), new f(h2, 50706, 1), new f(i2, 50720, 3, 4)};
        K6 = fVarArr3;
        f[] fVarArr4 = {new f(x1, 0, 1), new f(y1, 1, 2), new f(z1, 2, 5, 10), new f(A1, 3, 2), new f(B1, 4, 5, 10), new f(C1, 5, 1), new f(D1, 6, 5), new f(E1, 7, 5), new f(F1, 8, 2), new f(G1, 9, 2), new f(H1, 10, 2), new f(I1, 11, 5), new f(J1, 12, 2), new f(K1, 13, 5), new f(L1, 14, 2), new f(M1, 15, 5), new f(N1, 16, 2), new f(O1, 17, 5), new f(P1, 18, 2), new f(Q1, 19, 2), new f(R1, 20, 5), new f(S1, 21, 2), new f(T1, 22, 5), new f(U1, 23, 2), new f(V1, 24, 5), new f(W1, 25, 2), new f(X1, 26, 5), new f(Y1, 27, 7), new f(Z1, 28, 7), new f(a2, 29, 2), new f(b2, 30, 3), new f(c2, 31, 5)};
        L6 = fVarArr4;
        f[] fVarArr5 = {new f(d2, 1, 2)};
        M6 = fVarArr5;
        f[] fVarArr6 = {new f(u2, C9680tD0.l, 4), new f(v2, 255, 4), new f(f2, 256, 3, 4), new f(e2, 257, 3, 4), new f(z, 258, 3), new f(A, 259, 3), new f(B, 262, 3), new f(V, C4731Xo.d1, 2), new f(W, 271, 2), new f(X, 272, 2), new f(K, AudioAttributesCompat.O, 3, 4), new f(g2, C9276rZ.q, 3), new f(D, 277, 3), new f(L, 278, 3, 4), new f(M, 279, 3, 4), new f(H, 282, 5), new f(I, 283, 5), new f(E, 284, 3), new f(J, 296, 3), new f(P, 301, 3), new f(Y, 305, 2), new f(U, 306, 2), new f(Z, 315, 2), new f(Q, InterfaceC8148mw2.a.s, 5), new f(R, 319, 5), new f("SubIFDPointer", 330, 4), new f(N, C6793hQ0.j, 4), new f(O, 514, 4), new f(S, 529, 5), new f(F, 530, 3), new f(G, 531, 3), new f(T, 532, 5), new f(a0, 33432, 2), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f(h2, 50706, 1), new f(i2, 50720, 3, 4)};
        N6 = fVarArr6;
        O6 = new f(K, AudioAttributesCompat.O, 3);
        f[] fVarArr7 = {new f(j2, 256, 7), new f(A2, 8224, 4), new f(B2, 8256, 4)};
        P6 = fVarArr7;
        f[] fVarArr8 = {new f(k2, 257, 4), new f(l2, 258, 4)};
        Q6 = fVarArr8;
        f[] fVarArr9 = {new f(m2, 4371, 3)};
        R6 = fVarArr9;
        f[] fVarArr10 = {new f(d0, 55, 3)};
        S6 = fVarArr10;
        f[][] fVarArr11 = {fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr6, fVarArr2, fVarArr7, fVarArr8, fVarArr9, fVarArr10};
        d7 = fVarArr11;
        e7 = new f[]{new f("SubIFDPointer", 330, 4), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("InteroperabilityIFDPointer", 40965, 4), new f(A2, 8224, 1), new f(B2, 8256, 1)};
        f7 = new HashMap[fVarArr11.length];
        g7 = new HashMap[fVarArr11.length];
        h7 = new HashSet<>(Arrays.asList(v0, g1, u0, M0, E1));
        i7 = new HashMap<>();
        Charset forName = Charset.forName(OA.b);
        j7 = forName;
        k7 = C9276rZ.h.getBytes(forName);
        l7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        m6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        n6 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i8 = 0;
        while (true) {
            f[][] fVarArr12 = d7;
            if (i8 < fVarArr12.length) {
                f7[i8] = new HashMap<>();
                g7[i8] = new HashMap<>();
                for (f fVar : fVarArr12[i8]) {
                    f7[i8].put(Integer.valueOf(fVar.a), fVar);
                    g7[i8].put(fVar.b, fVar);
                }
                i8++;
            } else {
                HashMap<Integer, Integer> hashMap = i7;
                f[] fVarArr13 = e7;
                hashMap.put(Integer.valueOf(fVarArr13[0].a), 5);
                hashMap.put(Integer.valueOf(fVarArr13[1].a), 1);
                hashMap.put(Integer.valueOf(fVarArr13[2].a), 2);
                hashMap.put(Integer.valueOf(fVarArr13[3].a), 3);
                hashMap.put(Integer.valueOf(fVarArr13[4].a), 7);
                hashMap.put(Integer.valueOf(fVarArr13[5].a), 8);
                U7 = Pattern.compile(".*[1-9].*");
                V7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                W7 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                X7 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C2638Cg0(File file) throws IOException {
        f[][] fVarArr = d7;
        this.f = new HashMap[fVarArr.length];
        this.g = new HashSet(fVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            O(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    public static boolean A0(int i8) {
        if (i8 != 4 && i8 != 9 && i8 != 13 && i8 != 14) {
            return true;
        }
        return false;
    }

    public static Pair<Integer, Integer> J(String str) {
        int intValue;
        int i8;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> J8 = J(split[0]);
            if (((Integer) J8.first).intValue() == 2) {
                return J8;
            }
            for (int i9 = 1; i9 < split.length; i9++) {
                Pair<Integer, Integer> J9 = J(split[i9]);
                if (!((Integer) J9.first).equals(J8.first) && !((Integer) J9.second).equals(J8.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) J8.first).intValue();
                }
                if (((Integer) J8.second).intValue() != -1 && (((Integer) J9.first).equals(J8.second) || ((Integer) J9.second).equals(J8.second))) {
                    i8 = ((Integer) J8.second).intValue();
                } else {
                    i8 = -1;
                }
                if (intValue == -1 && i8 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    J8 = new Pair<>(Integer.valueOf(i8), -1);
                } else if (i8 == -1) {
                    J8 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return J8;
        } else if (str.contains(RemoteSettings.i)) {
            String[] split2 = str.split(RemoteSettings.i, -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    int i10 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                    if (i10 >= 0 && parseLong <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return new Pair<>(3, 4);
                    }
                    if (i10 < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair<>(2, -1);
            }
        }
    }

    public static boolean P(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = k7;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr3 = k7;
            if (i8 < bArr3.length) {
                if (bArr2[i8] != bArr3[i8]) {
                    return false;
                }
                i8++;
            } else {
                return true;
            }
        }
    }

    public static boolean S(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = D5;
            if (i8 < bArr2.length) {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            } else {
                return true;
            }
        }
    }

    public static boolean X(FileDescriptor fileDescriptor) {
        try {
            C2834Eg0.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (w) {
                Log.d(v, "The file descriptor for the given input is not seekable");
                return false;
            }
            return false;
        }
    }

    public static boolean Z(int i8) {
        if (i8 != 4 && i8 != 13 && i8 != 14) {
            return false;
        }
        return true;
    }

    public static boolean a0(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            char c8 = 65535;
            switch (lowerCase.hashCode()) {
                case -1875291391:
                    if (lowerCase.equals("image/x-fuji-raf")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1635437028:
                    if (lowerCase.equals("image/x-samsung-srw")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1594371159:
                    if (lowerCase.equals("image/x-sony-arw")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1487464693:
                    if (lowerCase.equals(C4128Rj1.S0)) {
                        c8 = 3;
                        break;
                    }
                    break;
                case -1487464690:
                    if (lowerCase.equals(C4128Rj1.T0)) {
                        c8 = 4;
                        break;
                    }
                    break;
                case -1487394660:
                    if (lowerCase.equals(C4128Rj1.R0)) {
                        c8 = 5;
                        break;
                    }
                    break;
                case -1487018032:
                    if (lowerCase.equals(C4128Rj1.Q0)) {
                        c8 = 6;
                        break;
                    }
                    break;
                case -1423313290:
                    if (lowerCase.equals("image/x-adobe-dng")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case -985160897:
                    if (lowerCase.equals("image/x-panasonic-rw2")) {
                        c8 = '\b';
                        break;
                    }
                    break;
                case -879258763:
                    if (lowerCase.equals(C4128Rj1.P0)) {
                        c8 = '\t';
                        break;
                    }
                    break;
                case -332763809:
                    if (lowerCase.equals("image/x-pentax-pef")) {
                        c8 = '\n';
                        break;
                    }
                    break;
                case 1378106698:
                    if (lowerCase.equals("image/x-olympus-orf")) {
                        c8 = 11;
                        break;
                    }
                    break;
                case 2099152104:
                    if (lowerCase.equals("image/x-nikon-nef")) {
                        c8 = '\f';
                        break;
                    }
                    break;
                case 2099152524:
                    if (lowerCase.equals("image/x-nikon-nrw")) {
                        c8 = C8206nB.d;
                        break;
                    }
                    break;
                case 2111234748:
                    if (lowerCase.equals("image/x-canon-cr2")) {
                        c8 = 14;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                    return true;
                default:
                    return false;
            }
        }
        throw new NullPointerException("mimeType shouldn't be null");
    }

    public static double c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split(RemoteSettings.i, -1);
            String[] split3 = split[1].split(RemoteSettings.i, -1);
            String[] split4 = split[2].split(RemoteSettings.i, -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals(T4)) {
                if (!str2.equals("N") && !str2.equals(S4)) {
                    throw new IllegalArgumentException();
                }
                return parseDouble;
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static Long f0(String str, String str2, String str3) {
        if (str != null && U7.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date parse = m6.parse(str, parsePosition);
                if (parse == null && (parse = n6.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = parse.getTime();
                if (str3 != null) {
                    int i8 = 1;
                    String substring = str3.substring(0, 1);
                    int parseInt = Integer.parseInt(str3.substring(1, 3));
                    int parseInt2 = Integer.parseInt(str3.substring(4, 6));
                    if ((C2555Bk.p1.equals(substring) || "-".equals(substring)) && ":".equals(str3.substring(3, 4)) && parseInt <= 14) {
                        int i9 = ((parseInt * 60) + parseInt2) * 60000;
                        if (!"-".equals(substring)) {
                            i8 = -1;
                        }
                        time += i9 * i8;
                    }
                }
                if (str2 != null) {
                    time += C2834Eg0.g(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public final void A(i iVar) throws IOException {
        d dVar;
        g0(iVar);
        k0(iVar, 0);
        C0(iVar, 0);
        C0(iVar, 5);
        C0(iVar, 4);
        D0();
        if (this.d == 8 && (dVar = this.f[1].get(j0)) != null) {
            i iVar2 = new i(dVar.d);
            iVar2.f(this.h);
            iVar2.h(6);
            k0(iVar2, 9);
            d dVar2 = this.f[9].get(d0);
            if (dVar2 != null) {
                this.f[1].put(d0, dVar2);
            }
        }
    }

    public int B() {
        switch (l(C, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return C4731Xo.d1;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void B0(int i8, int i9) throws IOException {
        if (!this.f[i8].isEmpty() && !this.f[i9].isEmpty()) {
            d dVar = this.f[i8].get(y);
            d dVar2 = this.f[i8].get(x);
            d dVar3 = this.f[i9].get(y);
            d dVar4 = this.f[i9].get(x);
            if (dVar != null && dVar2 != null) {
                if (dVar3 != null && dVar4 != null) {
                    int p = dVar.p(this.h);
                    int p8 = dVar2.p(this.h);
                    int p9 = dVar3.p(this.h);
                    int p10 = dVar4.p(this.h);
                    if (p < p9 && p8 < p10) {
                        HashMap<String, d>[] hashMapArr = this.f;
                        HashMap<String, d> hashMap = hashMapArr[i8];
                        hashMapArr[i8] = hashMapArr[i9];
                        hashMapArr[i9] = hashMap;
                    }
                } else if (w) {
                    Log.d(v, "Second image does not contain valid size information");
                }
            } else if (w) {
                Log.d(v, "First image does not contain valid size information");
            }
        } else if (w) {
            Log.d(v, "Cannot perform swap since only one image data exists");
        }
    }

    public final void C(i iVar) throws IOException {
        if (w) {
            Log.d(v, "getRw2Attributes starting with: " + iVar);
        }
        A(iVar);
        d dVar = this.f[0].get(s2);
        if (dVar != null) {
            t(new b(dVar.d), (int) dVar.c, 5);
        }
        d dVar2 = this.f[0].get(r2);
        d dVar3 = this.f[1].get(z0);
        if (dVar2 != null && dVar3 == null) {
            this.f[1].put(z0, dVar2);
        }
    }

    public final void C0(i iVar, int i8) throws IOException {
        d m;
        d m8;
        d dVar = this.f[i8].get(i2);
        d dVar2 = this.f[i8].get(q2);
        d dVar3 = this.f[i8].get(o2);
        d dVar4 = this.f[i8].get(n2);
        d dVar5 = this.f[i8].get(p2);
        if (dVar != null) {
            if (dVar.a == 5) {
                h[] hVarArr = (h[]) dVar.r(this.h);
                if (hVarArr != null && hVarArr.length == 2) {
                    m = d.k(hVarArr[0], this.h);
                    m8 = d.k(hVarArr[1], this.h);
                } else {
                    Log.w(v, "Invalid crop size values. cropSize=" + Arrays.toString(hVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) dVar.r(this.h);
                if (iArr != null && iArr.length == 2) {
                    m = d.m(iArr[0], this.h);
                    m8 = d.m(iArr[1], this.h);
                } else {
                    Log.w(v, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            this.f[i8].put(x, m);
            this.f[i8].put(y, m8);
        } else if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int p = dVar2.p(this.h);
            int p8 = dVar4.p(this.h);
            int p9 = dVar5.p(this.h);
            int p10 = dVar3.p(this.h);
            if (p8 > p && p9 > p10) {
                d m9 = d.m(p8 - p, this.h);
                d m10 = d.m(p9 - p10, this.h);
                this.f[i8].put(y, m9);
                this.f[i8].put(x, m10);
            }
        } else {
            o0(iVar, i8);
        }
    }

    public final void D(i iVar) throws IOException {
        byte[] bArr = k7;
        iVar.h(bArr.length);
        byte[] bArr2 = new byte[iVar.available()];
        iVar.readFully(bArr2);
        this.p = bArr.length;
        j0(bArr2, 0);
    }

    public final void D0() throws IOException {
        B0(0, 5);
        B0(0, 4);
        B0(5, 4);
        d dVar = this.f[1].get(f0);
        d dVar2 = this.f[1].get(g0);
        if (dVar != null && dVar2 != null) {
            this.f[0].put(x, dVar);
            this.f[0].put(y, dVar2);
        }
        if (this.f[4].isEmpty() && b0(this.f[5])) {
            HashMap<String, d>[] hashMapArr = this.f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!b0(this.f[4])) {
            Log.d(v, "No image meets the size requirements of a thumbnail image.");
        }
        m0(0, g2, C);
        m0(0, e2, y);
        m0(0, f2, x);
        m0(5, g2, C);
        m0(5, e2, y);
        m0(5, f2, x);
        m0(4, C, g2);
        m0(4, y, e2);
        m0(4, x, f2);
    }

    public byte[] E() {
        int i8 = this.f432o;
        if (i8 != 6 && i8 != 7) {
            return null;
        }
        return G();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int E0(c cVar) throws IOException {
        char c8;
        char c9;
        int i8;
        int i9;
        int i10;
        int i11;
        long j;
        f[][] fVarArr = d7;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (f fVar : e7) {
            l0(fVar.b);
        }
        if (this.i) {
            if (this.j) {
                l0(K);
                l0(M);
            } else {
                l0(N);
                l0(O);
            }
        }
        for (int i12 = 0; i12 < d7.length; i12++) {
            for (Object obj : this.f[i12].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f[i12].remove(entry.getKey());
                }
            }
        }
        long j8 = 0;
        if (!this.f[1].isEmpty()) {
            this.f[0].put(e7[1].b, d.i(0L, this.h));
        }
        if (!this.f[2].isEmpty()) {
            this.f[0].put(e7[2].b, d.i(0L, this.h));
        }
        if (this.f[3].isEmpty()) {
            c8 = 2;
        } else {
            c8 = 2;
            this.f[1].put(e7[3].b, d.i(0L, this.h));
        }
        if (this.i) {
            if (this.j) {
                this.f[4].put(K, d.m(0, this.h));
                this.f[4].put(M, d.m(this.m, this.h));
            } else {
                this.f[4].put(N, d.i(0L, this.h));
                c9 = 3;
                this.f[4].put(O, d.i(this.m, this.h));
                for (i8 = 0; i8 < d7.length; i8++) {
                    int i13 = 0;
                    for (Map.Entry<String, d> entry2 : this.f[i8].entrySet()) {
                        int s = entry2.getValue().s();
                        if (s > 4) {
                            i13 += s;
                        }
                    }
                    iArr2[i8] = iArr2[i8] + i13;
                }
                int i14 = 8;
                for (i9 = 0; i9 < d7.length; i9++) {
                    if (!this.f[i9].isEmpty()) {
                        iArr[i9] = i14;
                        i14 += (this.f[i9].size() * 12) + 6 + iArr2[i9];
                    }
                }
                if (this.i) {
                    if (this.j) {
                        this.f[4].put(K, d.m(i14, this.h));
                    } else {
                        this.f[4].put(N, d.i(i14, this.h));
                    }
                    this.l = i14;
                    i14 += this.m;
                }
                if (this.d == 4) {
                    i14 += 8;
                }
                if (w) {
                    for (int i15 = 0; i15 < d7.length; i15++) {
                        Log.d(v, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i14)));
                    }
                }
                if (!this.f[1].isEmpty()) {
                    this.f[0].put(e7[1].b, d.i(iArr[1], this.h));
                }
                if (!this.f[c8].isEmpty()) {
                    this.f[0].put(e7[c8].b, d.i(iArr[c8], this.h));
                }
                if (!this.f[c9].isEmpty()) {
                    this.f[1].put(e7[c9].b, d.i(iArr[c9], this.h));
                }
                i10 = this.d;
                if (i10 != 4) {
                    cVar.j(i14);
                    cVar.write(k7);
                } else if (i10 == 13) {
                    cVar.f(i14);
                    cVar.write(T5);
                } else if (i10 == 14) {
                    cVar.write(b6);
                    cVar.f(i14);
                }
                cVar.h(this.h != ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                cVar.a(this.h);
                cVar.j(42);
                cVar.i(8L);
                i11 = 0;
                while (i11 < d7.length) {
                    if (this.f[i11].isEmpty()) {
                        j = j8;
                    } else {
                        cVar.j(this.f[i11].size());
                        int size = iArr[i11] + 2 + (this.f[i11].size() * 12) + 4;
                        for (Map.Entry<String, d> entry3 : this.f[i11].entrySet()) {
                            int i16 = g7[i11].get(entry3.getKey()).a;
                            d value = entry3.getValue();
                            int s8 = value.s();
                            cVar.j(i16);
                            cVar.j(value.a);
                            cVar.f(value.b);
                            if (s8 > 4) {
                                cVar.i(size);
                                size += s8;
                            } else {
                                cVar.write(value.d);
                                if (s8 < 4) {
                                    while (s8 < 4) {
                                        cVar.d(0);
                                        s8++;
                                    }
                                }
                            }
                        }
                        if (i11 == 0 && !this.f[4].isEmpty()) {
                            cVar.i(iArr[4]);
                            j = 0;
                        } else {
                            j = 0;
                            cVar.i(0L);
                        }
                        for (Map.Entry<String, d> entry4 : this.f[i11].entrySet()) {
                            byte[] bArr = entry4.getValue().d;
                            if (bArr.length > 4) {
                                cVar.write(bArr, 0, bArr.length);
                            }
                        }
                    }
                    i11++;
                    j8 = j;
                }
                if (this.i) {
                    cVar.write(G());
                }
                if (this.d == 14 && i14 % 2 == 1) {
                    cVar.d(0);
                }
                cVar.a(ByteOrder.BIG_ENDIAN);
                return i14;
            }
        }
        c9 = 3;
        while (i8 < d7.length) {
        }
        int i142 = 8;
        while (i9 < d7.length) {
        }
        if (this.i) {
        }
        if (this.d == 4) {
        }
        if (w) {
        }
        if (!this.f[1].isEmpty()) {
        }
        if (!this.f[c8].isEmpty()) {
        }
        if (!this.f[c9].isEmpty()) {
        }
        i10 = this.d;
        if (i10 != 4) {
        }
        cVar.h(this.h != ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.a(this.h);
        cVar.j(42);
        cVar.i(8L);
        i11 = 0;
        while (i11 < d7.length) {
        }
        if (this.i) {
        }
        if (this.d == 14) {
            cVar.d(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i142;
    }

    public Bitmap F() {
        if (!this.i) {
            return null;
        }
        if (this.n == null) {
            this.n = G();
        }
        int i8 = this.f432o;
        if (i8 != 6 && i8 != 7) {
            if (i8 == 1) {
                int length = this.n.length / 3;
                int[] iArr = new int[length];
                for (int i9 = 0; i9 < length; i9++) {
                    byte[] bArr = this.n;
                    int i10 = i9 * 3;
                    iArr[i9] = (bArr[i10] << C8077mf.r) + (bArr[i10 + 1] << 8) + bArr[i10 + 2];
                }
                d dVar = this.f[4].get(e2);
                d dVar2 = this.f[4].get(f2);
                if (dVar != null && dVar2 != null) {
                    return Bitmap.createBitmap(iArr, dVar2.p(this.h), dVar.p(this.h), Bitmap.Config.ARGB_8888);
                }
            }
            return null;
        }
        return BitmapFactory.decodeByteArray(this.n, 0, this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f A[Catch: all -> 0x0086, Exception -> 0x0088, TRY_ENTER, TryCatch #2 {all -> 0x0086, blocks: (B:32:0x0059, B:35:0x006f, B:37:0x007b, B:46:0x008a, B:47:0x008f, B:48:0x0090, B:49:0x0095, B:54:0x009d), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090 A[Catch: all -> 0x0086, Exception -> 0x0088, TryCatch #2 {all -> 0x0086, blocks: (B:32:0x0059, B:35:0x006f, B:37:0x007b, B:46:0x008a, B:47:0x008f, B:48:0x0090, B:49:0x0095, B:54:0x009d), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] G() {
        FileDescriptor fileDescriptor;
        Exception e8;
        FileDescriptor fileDescriptor2;
        FileInputStream fileInputStream;
        Closeable closeable = null;
        if (!this.i) {
            return null;
        }
        ?? r12 = this.n;
        try {
            if (r12 != 0) {
                return r12;
            }
            try {
                r12 = this.c;
            } catch (Exception e9) {
                r12 = 0;
                e8 = e9;
                fileDescriptor2 = null;
            } catch (Throwable th) {
                th = th;
                fileDescriptor = null;
            }
            try {
                if (r12 != 0) {
                    try {
                        if (r12.markSupported()) {
                            r12.reset();
                            fileInputStream = r12;
                        } else {
                            Log.d(v, "Cannot read thumbnail from inputstream without mark/reset support");
                            C2834Eg0.c(r12);
                            return null;
                        }
                    } catch (Exception e10) {
                        e8 = e10;
                        fileDescriptor2 = null;
                        Log.d(v, "Encountered exception while getting thumbnail", e8);
                        C2834Eg0.c(r12);
                        if (fileDescriptor2 != null) {
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileDescriptor = null;
                        closeable = r12;
                        C2834Eg0.c(closeable);
                        if (fileDescriptor != null) {
                        }
                        throw th;
                    }
                } else if (this.a != null) {
                    fileInputStream = new FileInputStream(this.a);
                } else {
                    FileDescriptor b8 = C2834Eg0.a.b(this.b);
                    try {
                        C2834Eg0.a.c(b8, 0L, OsConstants.SEEK_SET);
                        fileDescriptor2 = b8;
                        r12 = new FileInputStream(b8);
                        if (r12.skip(this.l + this.p) != this.l + this.p) {
                            byte[] bArr = new byte[this.m];
                            if (r12.read(bArr) == this.m) {
                                this.n = bArr;
                                C2834Eg0.c(r12);
                                if (fileDescriptor2 != null) {
                                    C2834Eg0.b(fileDescriptor2);
                                }
                                return bArr;
                            }
                            throw new IOException("Corrupted image");
                        }
                        throw new IOException("Corrupted image");
                    } catch (Exception e11) {
                        e8 = e11;
                        fileDescriptor2 = b8;
                        r12 = 0;
                        Log.d(v, "Encountered exception while getting thumbnail", e8);
                        C2834Eg0.c(r12);
                        if (fileDescriptor2 != null) {
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileDescriptor = b8;
                        C2834Eg0.c(closeable);
                        if (fileDescriptor != null) {
                            C2834Eg0.b(fileDescriptor);
                        }
                        throw th;
                    }
                }
                if (r12.skip(this.l + this.p) != this.l + this.p) {
                }
            } catch (Exception e12) {
                e8 = e12;
                Log.d(v, "Encountered exception while getting thumbnail", e8);
                C2834Eg0.c(r12);
                if (fileDescriptor2 != null) {
                    C2834Eg0.b(fileDescriptor2);
                }
                return null;
            }
            fileDescriptor2 = null;
            r12 = fileInputStream;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public long[] H() {
        if (!this.t) {
            if (!this.i) {
                return null;
            }
            if (!this.j || this.k) {
                return new long[]{this.l + this.p, this.m};
            }
            return null;
        }
        throw new IllegalStateException("The underlying file has been modified since being parsed");
    }

    public final void I(b bVar) throws IOException {
        if (w) {
            Log.d(v, "getWebpAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.LITTLE_ENDIAN);
        bVar.h(Y5.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = Z5;
        bVar.h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i8 = length + 8;
                    if (Arrays.equals(b6, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.p = i8;
                            j0(bArr3, 0);
                            z0(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C2834Eg0.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i8 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.h(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void K(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(N);
        d dVar2 = (d) hashMap.get(O);
        if (dVar != null && dVar2 != null) {
            int p = dVar.p(this.h);
            int p8 = dVar2.p(this.h);
            if (this.d == 7) {
                p += this.q;
            }
            if (p > 0 && p8 > 0) {
                this.i = true;
                if (this.a == null && this.c == null && this.b == null) {
                    byte[] bArr = new byte[p8];
                    bVar.skip(p);
                    bVar.read(bArr);
                    this.n = bArr;
                }
                this.l = p;
                this.m = p8;
            }
            if (w) {
                Log.d(v, "Setting thumbnail attributes with offset: " + p + ", length: " + p8);
            }
        }
    }

    public final void L(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(K);
        d dVar2 = (d) hashMap.get(M);
        if (dVar != null && dVar2 != null) {
            long[] d8 = C2834Eg0.d(dVar.r(this.h));
            long[] d9 = C2834Eg0.d(dVar2.r(this.h));
            if (d8 != null && d8.length != 0) {
                if (d9 != null && d9.length != 0) {
                    if (d8.length != d9.length) {
                        Log.w(v, "stripOffsets and stripByteCounts should have same length.");
                        return;
                    }
                    long j = 0;
                    for (long j8 : d9) {
                        j += j8;
                    }
                    int i8 = (int) j;
                    byte[] bArr = new byte[i8];
                    this.k = true;
                    this.j = true;
                    this.i = true;
                    int i9 = 0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < d8.length; i11++) {
                        int i12 = (int) d8[i11];
                        int i13 = (int) d9[i11];
                        if (i11 < d8.length - 1 && i12 + i13 != d8[i11 + 1]) {
                            this.k = false;
                        }
                        int i14 = i12 - i9;
                        if (i14 < 0) {
                            Log.d(v, "Invalid strip offset value");
                            return;
                        }
                        long j9 = i14;
                        if (bVar.skip(j9) != j9) {
                            Log.d(v, "Failed to skip " + i14 + " bytes.");
                            return;
                        }
                        int i15 = i9 + i14;
                        byte[] bArr2 = new byte[i13];
                        if (bVar.read(bArr2) != i13) {
                            Log.d(v, "Failed to read " + i13 + " bytes.");
                            return;
                        }
                        i9 = i15 + i13;
                        System.arraycopy(bArr2, 0, bArr, i10, i13);
                        i10 += i13;
                    }
                    this.n = bArr;
                    if (this.k) {
                        this.l = (int) d8[0];
                        this.m = i8;
                        return;
                    }
                    return;
                }
                Log.w(v, "stripByteCounts should not be null or have zero length.");
                return;
            }
            Log.w(v, "stripOffsets should not be null or have zero length.");
        }
    }

    public boolean M(String str) {
        if (q(str) != null) {
            return true;
        }
        return false;
    }

    public boolean N() {
        return this.i;
    }

    public final void O(String str) throws IOException {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.c = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (X(fileInputStream2.getFD())) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    e0(fileInputStream2);
                    C2834Eg0.c(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    C2834Eg0.c(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    public boolean Q() {
        int l = l(C, 1);
        if (l == 2 || l == 7 || l == 4 || l == 5) {
            return true;
        }
        return false;
    }

    public final boolean R(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    readInt = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.read(bArr2);
                } catch (Exception e8) {
                    e = e8;
                    bVar2 = bVar;
                    if (w) {
                        Log.d(v, "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
        if (!Arrays.equals(bArr2, G5)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j8 = readInt - j;
        if (j8 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z8 = false;
        boolean z9 = false;
        for (long j9 = 0; j9 < j8 / 4; j9++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j9 != 1) {
                if (Arrays.equals(bArr3, H5)) {
                    z8 = true;
                } else if (Arrays.equals(bArr3, I5)) {
                    z9 = true;
                }
                if (z8 && z9) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    public final boolean T(byte[] bArr) throws IOException {
        b bVar;
        boolean z8 = false;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder i02 = i0(bVar);
            this.h = i02;
            bVar.f(i02);
            short readShort = bVar.readShort();
            z8 = (readShort == 20306 || readShort == 21330) ? true : true;
            bVar.close();
            return z8;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final boolean U(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = S5;
            if (i8 < bArr2.length) {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            } else {
                return true;
            }
        }
    }

    public final boolean V(byte[] bArr) throws IOException {
        byte[] bytes = E5.getBytes(Charset.defaultCharset());
        for (int i8 = 0; i8 < bytes.length; i8++) {
            if (bArr[i8] != bytes[i8]) {
                return false;
            }
        }
        return true;
    }

    public final boolean W(byte[] bArr) throws IOException {
        b bVar;
        boolean z8 = false;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder i02 = i0(bVar);
            this.h = i02;
            bVar.f(i02);
            if (bVar.readShort() == 85) {
                z8 = true;
            }
            bVar.close();
            return z8;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final boolean Y(HashMap hashMap) throws IOException {
        d dVar;
        int p;
        d dVar2 = (d) hashMap.get(z);
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.r(this.h);
            int[] iArr2 = r5;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.d == 3 && (dVar = (d) hashMap.get(B)) != null && (((p = dVar.p(this.h)) == 1 && Arrays.equals(iArr, t5)) || (p == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (w) {
            Log.d(v, "Unsupported data type value");
            return false;
        }
        return false;
    }

    public final void a() {
        String i8 = i(m0);
        if (i8 != null && i(U) == null) {
            this.f[0].put(U, d.h(i8));
        }
        if (i(x) == null) {
            this.f[0].put(x, d.i(0L, this.h));
        }
        if (i(y) == null) {
            this.f[0].put(y, d.i(0L, this.h));
        }
        if (i(C) == null) {
            this.f[0].put(C, d.i(0L, this.h));
        }
        if (i(O0) == null) {
            this.f[1].put(O0, d.i(0L, this.h));
        }
    }

    public final String b(double d8) {
        long j = (long) d8;
        double d9 = d8 - j;
        long j8 = (long) (d9 * 60.0d);
        long round = Math.round((d9 - (j8 / 60.0d)) * 3600.0d * 1.0E7d);
        return j + "/1," + j8 + "/1," + round + "/10000000";
    }

    public final boolean b0(HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(y);
        d dVar2 = (d) hashMap.get(x);
        if (dVar != null && dVar2 != null) {
            int p = dVar.p(this.h);
            int p8 = dVar2.p(this.h);
            if (p <= 512 && p8 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean c0() {
        if (!this.i) {
            return false;
        }
        int i8 = this.f432o;
        if (i8 != 6 && i8 != 7) {
            return false;
        }
        return true;
    }

    public final void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        Charset charset;
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                sb.append(new String(bArr, j7));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            e(bVar, cVar, bArr3);
            if (!Arrays.equals(bArr3, bArr)) {
                if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean d0(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = Y5;
            if (i8 < bArr2.length) {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            } else {
                int i9 = 0;
                while (true) {
                    byte[] bArr3 = Z5;
                    if (i9 < bArr3.length) {
                        if (bArr[Y5.length + i9 + 4] != bArr3[i9]) {
                            return false;
                        }
                        i9++;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    public final void e(b bVar, c cVar, byte[] bArr) throws IOException {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.f(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        C2834Eg0.f(bVar, cVar, readInt);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:48:0x009b, B:50:0x009f), top: B:61:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(InputStream inputStream) {
        boolean z8;
        if (inputStream != null) {
            for (int i8 = 0; i8 < d7.length; i8++) {
                try {
                    try {
                        this.f[i8] = new HashMap<>();
                    } catch (IOException e8) {
                        e = e8;
                        z8 = w;
                        if (z8) {
                            Log.w(v, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                        }
                        a();
                        if (!z8) {
                            h0();
                            return;
                        }
                        return;
                    } catch (UnsupportedOperationException e9) {
                        e = e9;
                        z8 = w;
                        if (z8) {
                        }
                        a();
                        if (!z8) {
                        }
                    }
                } catch (Throwable th) {
                    a();
                    if (w) {
                        h0();
                    }
                    throw th;
                }
            }
            if (!this.e) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.d = w(bufferedInputStream);
                inputStream = bufferedInputStream;
            }
            if (A0(this.d)) {
                i iVar = new i(inputStream);
                if (this.e) {
                    D(iVar);
                } else {
                    int i9 = this.d;
                    if (i9 == 12) {
                        s(iVar);
                    } else if (i9 == 7) {
                        x(iVar);
                    } else if (i9 == 10) {
                        C(iVar);
                    } else {
                        A(iVar);
                    }
                }
                iVar.seek(this.p);
                z0(iVar);
            } else {
                b bVar = new b(inputStream);
                int i10 = this.d;
                if (i10 == 4) {
                    t(bVar, 0, 0);
                } else if (i10 == 13) {
                    y(bVar);
                } else if (i10 == 9) {
                    z(bVar);
                } else if (i10 == 14) {
                    I(bVar);
                }
            }
            a();
            if (w) {
                h0();
                return;
            }
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    public void f() {
        int i8 = 1;
        switch (l(C, 1)) {
            case 1:
                i8 = 2;
                break;
            case 2:
                break;
            case 3:
                i8 = 4;
                break;
            case 4:
                i8 = 3;
                break;
            case 5:
                i8 = 6;
                break;
            case 6:
                i8 = 5;
                break;
            case 7:
                i8 = 8;
                break;
            case 8:
                i8 = 7;
                break;
            default:
                i8 = 0;
                break;
        }
        v0(C, Integer.toString(i8));
    }

    public void g() {
        int i8 = 1;
        switch (l(C, 1)) {
            case 1:
                i8 = 4;
                break;
            case 2:
                i8 = 3;
                break;
            case 3:
                i8 = 2;
                break;
            case 4:
                break;
            case 5:
                i8 = 8;
                break;
            case 6:
                i8 = 7;
                break;
            case 7:
                i8 = 6;
                break;
            case 8:
                i8 = 5;
                break;
            default:
                i8 = 0;
                break;
        }
        v0(C, Integer.toString(i8));
    }

    public final void g0(b bVar) throws IOException {
        ByteOrder i02 = i0(bVar);
        this.h = i02;
        bVar.f(i02);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i8 = this.d;
        if (i8 != 7 && i8 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8) {
            int i9 = readInt - 8;
            if (i9 > 0) {
                bVar.h(i9);
                return;
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    public double h(double d8) {
        double k = k(D1, -1.0d);
        int i8 = -1;
        int l = l(C1, -1);
        if (k >= 0.0d && l >= 0) {
            if (l != 1) {
                i8 = 1;
            }
            return k * i8;
        }
        return d8;
    }

    public final void h0() {
        for (int i8 = 0; i8 < this.f.length; i8++) {
            Log.d(v, "The size of tag group[" + i8 + "]: " + this.f[i8].size());
            for (Map.Entry<String, d> entry : this.f[i8].entrySet()) {
                d value = entry.getValue();
                Log.d(v, "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.q(this.h) + "'");
            }
        }
    }

    public String i(String str) {
        if (str != null) {
            d q = q(str);
            if (q != null) {
                if (!h7.contains(str)) {
                    return q.q(this.h);
                }
                if (str.equals(E1)) {
                    int i8 = q.a;
                    if (i8 != 5 && i8 != 10) {
                        Log.w(v, "GPS Timestamp format is not rational. format=" + q.a);
                        return null;
                    }
                    h[] hVarArr = (h[]) q.r(this.h);
                    if (hVarArr != null && hVarArr.length == 3) {
                        h hVar = hVarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) hVar.a) / ((float) hVar.b)));
                        h hVar2 = hVarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) hVar2.a) / ((float) hVar2.b)));
                        h hVar3 = hVarArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) hVar3.a) / ((float) hVar3.b))));
                    }
                    Log.w(v, "Invalid GPS Timestamp array. array=" + Arrays.toString(hVarArr));
                    return null;
                }
                try {
                    return Double.toString(q.o(this.h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final ByteOrder i0(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (w) {
                    Log.d(v, "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (w) {
            Log.d(v, "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public byte[] j(String str) {
        if (str != null) {
            d q = q(str);
            if (q != null) {
                return q.d;
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void j0(byte[] bArr, int i8) throws IOException {
        i iVar = new i(bArr);
        g0(iVar);
        k0(iVar, i8);
    }

    public double k(String str, double d8) {
        if (str != null) {
            d q = q(str);
            if (q != null) {
                try {
                    return q.o(this.h);
                } catch (NumberFormatException unused) {
                    return d8;
                }
            }
            return d8;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(i iVar, int i8) throws IOException {
        short s;
        short s8;
        long j;
        int i9;
        f fVar;
        int[] iArr;
        long j8;
        boolean z8;
        boolean z9;
        long j9;
        f fVar2;
        int readUnsignedShort;
        long j10;
        String str;
        int i10 = i8;
        this.g.add(Integer.valueOf(iVar.Z));
        short readShort = iVar.readShort();
        if (w) {
            Log.d(v, "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort > 0) {
            short s9 = 0;
            while (s9 < readShort) {
                int readUnsignedShort2 = iVar.readUnsignedShort();
                int readUnsignedShort3 = iVar.readUnsignedShort();
                int readInt = iVar.readInt();
                long a8 = iVar.a() + 4;
                f fVar3 = f7[i10].get(Integer.valueOf(readUnsignedShort2));
                boolean z10 = w;
                if (z10) {
                    Integer valueOf = Integer.valueOf(i10);
                    j = 4;
                    Integer valueOf2 = Integer.valueOf(readUnsignedShort2);
                    i9 = 4;
                    if (fVar3 != null) {
                        str = fVar3.b;
                    } else {
                        str = null;
                    }
                    s = readShort;
                    s8 = s9;
                    Log.d(v, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", valueOf, valueOf2, str, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
                } else {
                    s = readShort;
                    s8 = s9;
                    j = 4;
                    i9 = 4;
                }
                if (fVar3 == null) {
                    if (z10) {
                        Log.d(v, "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                    }
                } else {
                    if (readUnsignedShort3 > 0) {
                        if (readUnsignedShort3 < H6.length) {
                            if (!fVar3.a(readUnsignedShort3)) {
                                if (z10) {
                                    Log.d(v, "Skip the tag entry since data format (" + G6[readUnsignedShort3] + ") is unexpected for tag: " + fVar3.b);
                                }
                            } else {
                                if (readUnsignedShort3 == 7) {
                                    readUnsignedShort3 = fVar3.c;
                                }
                                fVar = fVar3;
                                j8 = readInt * iArr[readUnsignedShort3];
                                if (j8 >= 0 && j8 <= 2147483647L) {
                                    z8 = true;
                                    if (z8) {
                                    }
                                    s9 = (short) (s8 + 1);
                                    i10 = i8;
                                    readShort = s;
                                } else {
                                    if (z10) {
                                        Log.d(v, "Skip the tag entry since the number of components is invalid: " + readInt);
                                    }
                                    z8 = false;
                                    if (z8) {
                                        iVar.seek(a8);
                                    } else {
                                        if (j8 > j) {
                                            int readInt2 = iVar.readInt();
                                            if (z10) {
                                                Log.d(v, "seek to data offset: " + readInt2);
                                            }
                                            if (this.d == 7) {
                                                z9 = z10;
                                                fVar2 = fVar;
                                                if (j0.equals(fVar2.b)) {
                                                    this.q = readInt2;
                                                } else if (i10 == 6 && j2.equals(fVar2.b)) {
                                                    this.r = readInt2;
                                                    this.s = readInt;
                                                    d m = d.m(6, this.h);
                                                    j9 = a8;
                                                    d i11 = d.i(this.r, this.h);
                                                    d i12 = d.i(this.s, this.h);
                                                    this.f[i9].put(A, m);
                                                    this.f[i9].put(N, i11);
                                                    this.f[i9].put(O, i12);
                                                }
                                                j9 = a8;
                                            } else {
                                                z9 = z10;
                                                j9 = a8;
                                                fVar2 = fVar;
                                            }
                                            iVar.seek(readInt2);
                                        } else {
                                            z9 = z10;
                                            j9 = a8;
                                            fVar2 = fVar;
                                        }
                                        Integer num = i7.get(Integer.valueOf(readUnsignedShort2));
                                        if (z9) {
                                            Log.d(v, "nextIfdType: " + num + " byteCount: " + j8);
                                        }
                                        if (num != null) {
                                            if (readUnsignedShort3 != 3) {
                                                if (readUnsignedShort3 != i9) {
                                                    if (readUnsignedShort3 != 8) {
                                                        if (readUnsignedShort3 != 9 && readUnsignedShort3 != 13) {
                                                            j10 = -1;
                                                        } else {
                                                            readUnsignedShort = iVar.readInt();
                                                        }
                                                    } else {
                                                        readUnsignedShort = iVar.readShort();
                                                    }
                                                } else {
                                                    j10 = iVar.d();
                                                }
                                                if (z9) {
                                                    Log.d(v, String.format("Offset: %d, tagName: %s", Long.valueOf(j10), fVar2.b));
                                                }
                                                if (j10 <= 0) {
                                                    if (!this.g.contains(Integer.valueOf((int) j10))) {
                                                        iVar.seek(j10);
                                                        k0(iVar, num.intValue());
                                                    } else if (z9) {
                                                        Log.d(v, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j10 + C9811tl1.d);
                                                    }
                                                } else if (z9) {
                                                    Log.d(v, "Skip jump into the IFD since its offset is invalid: " + j10);
                                                }
                                                iVar.seek(j9);
                                            } else {
                                                readUnsignedShort = iVar.readUnsignedShort();
                                            }
                                            j10 = readUnsignedShort;
                                            if (z9) {
                                            }
                                            if (j10 <= 0) {
                                            }
                                            iVar.seek(j9);
                                        } else {
                                            int a9 = iVar.a() + this.p;
                                            byte[] bArr = new byte[(int) j8];
                                            iVar.readFully(bArr);
                                            long j11 = a9;
                                            f fVar4 = fVar2;
                                            long j12 = j9;
                                            d dVar = new d(readUnsignedShort3, readInt, j11, bArr);
                                            this.f[i8].put(fVar4.b, dVar);
                                            if (h2.equals(fVar4.b)) {
                                                this.d = 3;
                                            }
                                            if (((W.equals(fVar4.b) || X.equals(fVar4.b)) && dVar.q(this.h).contains(Q5)) || (A.equals(fVar4.b) && dVar.p(this.h) == 65535)) {
                                                this.d = 8;
                                            }
                                            if (iVar.a() != j12) {
                                                iVar.seek(j12);
                                            }
                                        }
                                    }
                                    s9 = (short) (s8 + 1);
                                    i10 = i8;
                                    readShort = s;
                                }
                            }
                        }
                    }
                    fVar = fVar3;
                    if (z10) {
                        Log.d(v, "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                    }
                    j8 = 0;
                    z8 = false;
                    if (z8) {
                    }
                    s9 = (short) (s8 + 1);
                    i10 = i8;
                    readShort = s;
                }
                fVar = fVar3;
                j8 = 0;
                z8 = false;
                if (z8) {
                }
                s9 = (short) (s8 + 1);
                i10 = i8;
                readShort = s;
            }
            int readInt3 = iVar.readInt();
            boolean z11 = w;
            if (z11) {
                Log.d(v, String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
            }
            long j13 = readInt3;
            if (j13 > 0) {
                if (!this.g.contains(Integer.valueOf(readInt3))) {
                    iVar.seek(j13);
                    if (this.f[4].isEmpty()) {
                        k0(iVar, 4);
                    } else if (this.f[5].isEmpty()) {
                        k0(iVar, 5);
                    }
                } else if (z11) {
                    Log.d(v, "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                }
            } else if (z11) {
                Log.d(v, "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
            }
        }
    }

    public int l(String str, int i8) {
        if (str != null) {
            d q = q(str);
            if (q != null) {
                try {
                    return q.p(this.h);
                } catch (NumberFormatException unused) {
                    return i8;
                }
            }
            return i8;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void l0(String str) {
        for (int i8 = 0; i8 < d7.length; i8++) {
            this.f[i8].remove(str);
        }
    }

    public long[] m(String str) {
        if (str != null) {
            if (!this.t) {
                d q = q(str);
                if (q != null) {
                    return new long[]{q.c, q.d.length};
                }
                return null;
            }
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void m0(int i8, String str, String str2) {
        if (!this.f[i8].isEmpty() && this.f[i8].get(str) != null) {
            HashMap<String, d> hashMap = this.f[i8];
            hashMap.put(str2, hashMap.get(str));
            this.f[i8].remove(str);
        }
    }

    public Long n() {
        return f0(i(U), i(r0), i(o0));
    }

    public void n0() {
        v0(C, Integer.toString(1));
    }

    public Long o() {
        return f0(i(n0), i(t0), i(q0));
    }

    public final void o0(i iVar, int i8) throws IOException {
        d dVar = this.f[i8].get(y);
        d dVar2 = this.f[i8].get(x);
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f[i8].get(N);
            d dVar4 = this.f[i8].get(O);
            if (dVar3 != null && dVar4 != null) {
                int p = dVar3.p(this.h);
                int p8 = dVar3.p(this.h);
                iVar.seek(p);
                byte[] bArr = new byte[p8];
                iVar.read(bArr);
                t(new b(bArr), p, i8);
            }
        }
    }

    public Long p() {
        return f0(i(m0), i(s0), i(p0));
    }

    public void p0(int i8) {
        if (i8 % 90 == 0) {
            int l = l(C, 1);
            List<Integer> list = M2;
            int i9 = 0;
            if (list.contains(Integer.valueOf(l))) {
                int indexOf = (list.indexOf(Integer.valueOf(l)) + (i8 / 90)) % 4;
                if (indexOf < 0) {
                    i9 = 4;
                }
                i9 = list.get(indexOf + i9).intValue();
            } else {
                List<Integer> list2 = N2;
                if (list2.contains(Integer.valueOf(l))) {
                    int indexOf2 = (list2.indexOf(Integer.valueOf(l)) + (i8 / 90)) % 4;
                    if (indexOf2 < 0) {
                        i9 = 4;
                    }
                    i9 = list2.get(indexOf2 + i9).intValue();
                }
            }
            v0(C, Integer.toString(i9));
            return;
        }
        throw new IllegalArgumentException("degree should be a multiple of 90");
    }

    public final d q(String str) {
        if (str != null) {
            if (y0.equals(str)) {
                if (w) {
                    Log.d(v, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = z0;
            }
            for (int i8 = 0; i8 < d7.length; i8++) {
                d dVar = this.f[i8].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q0() throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        FileInputStream fileInputStream2;
        Exception e8;
        FileOutputStream fileOutputStream4;
        FileInputStream fileInputStream3;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        if (Z(this.d)) {
            if (this.b == null && this.a == null) {
                throw new IOException("ExifInterface does not support saving attributes for the current input.");
            }
            if (this.i && this.j && !this.k) {
                throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
            }
            this.t = true;
            this.n = E();
            BufferedInputStream bufferedInputStream2 = null;
            try {
                File createTempFile = File.createTempFile("temp", "tmp");
                if (this.a != null) {
                    fileInputStream = new FileInputStream(this.a);
                } else {
                    C2834Eg0.a.c(this.b, 0L, OsConstants.SEEK_SET);
                    fileInputStream = new FileInputStream(this.b);
                }
                try {
                    fileOutputStream = new FileOutputStream(createTempFile);
                    try {
                        C2834Eg0.e(fileInputStream, fileOutputStream);
                        C2834Eg0.c(fileInputStream);
                        C2834Eg0.c(fileOutputStream);
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            try {
                                fileInputStream3 = new FileInputStream(createTempFile);
                            } catch (Exception e9) {
                                e = e9;
                                fileOutputStream2 = null;
                            }
                            try {
                                if (this.a != null) {
                                    fileOutputStream3 = new FileOutputStream(this.a);
                                } else {
                                    C2834Eg0.a.c(this.b, 0L, OsConstants.SEEK_SET);
                                    fileOutputStream3 = new FileOutputStream(this.b);
                                }
                                try {
                                    bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                    try {
                                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                                    } catch (Exception e10) {
                                        bufferedInputStream2 = fileInputStream3;
                                        exc = e10;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        closeable = null;
                                        bufferedInputStream2 = bufferedInputStream;
                                        C2834Eg0.c(bufferedInputStream2);
                                        C2834Eg0.c(closeable);
                                        if (0 == 0) {
                                        }
                                        throw th;
                                    }
                                } catch (Exception e11) {
                                    bufferedInputStream2 = fileInputStream3;
                                    exc = e11;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                fileOutputStream2 = null;
                                bufferedInputStream2 = fileInputStream3;
                                exc = e;
                                fileOutputStream3 = fileOutputStream2;
                                try {
                                    fileInputStream2 = new FileInputStream(createTempFile);
                                } catch (Exception e13) {
                                    fileInputStream2 = bufferedInputStream2;
                                    e8 = e13;
                                } catch (Throwable th3) {
                                    th = th3;
                                    C2834Eg0.c(bufferedInputStream2);
                                    C2834Eg0.c(fileOutputStream3);
                                    throw th;
                                }
                                try {
                                    if (this.a != null) {
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                    C2834Eg0.e(fileInputStream2, fileOutputStream3);
                                    C2834Eg0.c(fileInputStream2);
                                    C2834Eg0.c(fileOutputStream3);
                                    throw new IOException("Failed to save new file", exc);
                                } catch (Exception e14) {
                                    e8 = e14;
                                    try {
                                        throw new IOException("Failed to save new file. Original file is stored in " + createTempFile.getAbsolutePath(), e8);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bufferedInputStream2 = fileInputStream2;
                                        C2834Eg0.c(bufferedInputStream2);
                                        C2834Eg0.c(fileOutputStream3);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedInputStream2 = fileInputStream2;
                                    C2834Eg0.c(bufferedInputStream2);
                                    C2834Eg0.c(fileOutputStream3);
                                    throw th;
                                }
                            }
                            try {
                                int i8 = this.d;
                                if (i8 == 4) {
                                    r0(bufferedInputStream, bufferedOutputStream);
                                } else if (i8 == 13) {
                                    s0(bufferedInputStream, bufferedOutputStream);
                                } else if (i8 == 14) {
                                    t0(bufferedInputStream, bufferedOutputStream);
                                }
                                C2834Eg0.c(bufferedInputStream);
                                C2834Eg0.c(bufferedOutputStream);
                                createTempFile.delete();
                                this.n = null;
                            } catch (Exception e15) {
                                exc = e15;
                                bufferedInputStream2 = fileInputStream3;
                                fileInputStream2 = new FileInputStream(createTempFile);
                                if (this.a != null) {
                                    C2834Eg0.a.c(this.b, 0L, OsConstants.SEEK_SET);
                                    fileOutputStream4 = new FileOutputStream(this.b);
                                } else {
                                    fileOutputStream4 = new FileOutputStream(this.a);
                                }
                                fileOutputStream3 = fileOutputStream4;
                                C2834Eg0.e(fileInputStream2, fileOutputStream3);
                                C2834Eg0.c(fileInputStream2);
                                C2834Eg0.c(fileOutputStream3);
                                throw new IOException("Failed to save new file", exc);
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            closeable = null;
                            C2834Eg0.c(bufferedInputStream2);
                            C2834Eg0.c(closeable);
                            if (0 == 0) {
                                createTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        bufferedInputStream2 = fileInputStream;
                        try {
                            throw new IOException("Failed to copy original file to temp file", e);
                        } catch (Throwable th7) {
                            th = th7;
                            C2834Eg0.c(bufferedInputStream2);
                            C2834Eg0.c(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        bufferedInputStream2 = fileInputStream;
                        C2834Eg0.c(bufferedInputStream2);
                        C2834Eg0.c(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e17) {
                    e = e17;
                    fileOutputStream = null;
                } catch (Throwable th9) {
                    th = th9;
                    fileOutputStream = null;
                }
            } catch (Exception e18) {
                e = e18;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } else {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
    }

    public Long r() {
        String i8 = i(a2);
        String i9 = i(E1);
        if (i8 != null && i9 != null) {
            Pattern pattern = U7;
            if (pattern.matcher(i8).matches() || pattern.matcher(i9).matches()) {
                String str = i8 + ' ' + i9;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date parse = m6.parse(str, parsePosition);
                    if (parse == null && (parse = n6.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(parse.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    public final void r0(InputStream inputStream, OutputStream outputStream) throws IOException {
        d dVar;
        if (w) {
            Log.d(v, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + C9811tl1.d);
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.d(-1);
            if (bVar.readByte() == -40) {
                cVar.d(-40);
                if (i(t2) != null && this.u) {
                    dVar = this.f[0].remove(t2);
                } else {
                    dVar = null;
                }
                cVar.d(-1);
                cVar.d(-31);
                E0(cVar);
                if (dVar != null) {
                    this.f[0].put(t2, dVar);
                }
                byte[] bArr = new byte[4096];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            cVar.d(-1);
                            cVar.d(readByte);
                            int readUnsignedShort = bVar.readUnsignedShort();
                            cVar.j(readUnsignedShort);
                            int i8 = readUnsignedShort - 2;
                            if (i8 >= 0) {
                                while (i8 > 0) {
                                    int read = bVar.read(bArr, 0, Math.min(i8, 4096));
                                    if (read >= 0) {
                                        cVar.write(bArr, 0, read);
                                        i8 -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = bVar.readUnsignedShort();
                            int i9 = readUnsignedShort2 - 2;
                            if (i9 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (i9 >= 6) {
                                    if (bVar.read(bArr2) == 6) {
                                        if (Arrays.equals(bArr2, k7)) {
                                            bVar.h(readUnsignedShort2 - 8);
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                cVar.d(-1);
                                cVar.d(readByte);
                                cVar.j(readUnsignedShort2);
                                if (i9 >= 6) {
                                    i9 = readUnsignedShort2 - 8;
                                    cVar.write(bArr2);
                                }
                                while (i9 > 0) {
                                    int read2 = bVar.read(bArr, 0, Math.min(i9, 4096));
                                    if (read2 >= 0) {
                                        cVar.write(bArr, 0, read2);
                                        i9 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        cVar.d(-1);
                        cVar.d(readByte);
                        C2834Eg0.e(bVar, cVar);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void s(i iVar) throws IOException {
        String str;
        String str2;
        String str3;
        int i8;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    C2834Eg0.b.a(mediaMetadataRetriever, new a(iVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if (C3855Oo.f.equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if (C3855Oo.f.equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    if (str != null) {
                        this.f[0].put(x, d.m(Integer.parseInt(str), this.h));
                    }
                    if (str2 != null) {
                        this.f[0].put(y, d.m(Integer.parseInt(str2), this.h));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i8 = 1;
                                } else {
                                    i8 = 8;
                                }
                            } else {
                                i8 = 3;
                            }
                        } else {
                            i8 = 6;
                        }
                        this.f[0].put(C, d.m(i8, this.h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            iVar.seek(parseInt2);
                            byte[] bArr = new byte[6];
                            if (iVar.read(bArr) == 6) {
                                int i9 = parseInt2 + 6;
                                int i10 = parseInt3 - 6;
                                if (Arrays.equals(bArr, k7)) {
                                    byte[] bArr2 = new byte[i10];
                                    if (iVar.read(bArr2) == i10) {
                                        this.p = i9;
                                        j0(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (w) {
                        Log.d(v, "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    public final void s0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (w) {
            Log.d(v, "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + C9811tl1.d);
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = S5;
        C2834Eg0.f(bVar, cVar, bArr.length);
        int i8 = this.p;
        if (i8 == 0) {
            int readInt = bVar.readInt();
            cVar.f(readInt);
            C2834Eg0.f(bVar, cVar, readInt + 8);
        } else {
            C2834Eg0.f(bVar, cVar, (i8 - bArr.length) - 8);
            bVar.h(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                E0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.X).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.f((int) crc32.getValue());
                C2834Eg0.c(byteArrayOutputStream2);
                C2834Eg0.e(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                C2834Eg0.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
        r21.f(r20.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(b bVar, int i8, int i9) throws IOException {
        byte readByte;
        byte readByte2;
        String str;
        String str2;
        if (w) {
            Log.d(v, "getJpegAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            if (bVar.readByte() == -40) {
                int i10 = 2;
                while (true) {
                    if (bVar.readByte() == -1) {
                        byte readByte3 = bVar.readByte();
                        boolean z8 = w;
                        if (z8) {
                            Log.d(v, "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                        }
                        if (readByte3 != -39 && readByte3 != -38) {
                            int readUnsignedShort = bVar.readUnsignedShort();
                            int i11 = readUnsignedShort - 2;
                            int i12 = i10 + 4;
                            if (z8) {
                                Log.d(v, "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + C9811tl1.d);
                            }
                            if (i11 >= 0) {
                                if (readByte3 != -31) {
                                    if (readByte3 != -2) {
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                            default:
                                                                switch (readByte3) {
                                                                }
                                                            case -55:
                                                            case -54:
                                                            case -53:
                                                                bVar.h(1);
                                                                HashMap<String, d> hashMap = this.f[i9];
                                                                if (i9 != 4) {
                                                                    str = y;
                                                                } else {
                                                                    str = e2;
                                                                }
                                                                hashMap.put(str, d.i(bVar.readUnsignedShort(), this.h));
                                                                HashMap<String, d> hashMap2 = this.f[i9];
                                                                if (i9 != 4) {
                                                                    str2 = x;
                                                                } else {
                                                                    str2 = f2;
                                                                }
                                                                hashMap2.put(str2, d.i(bVar.readUnsignedShort(), this.h));
                                                                i11 = readUnsignedShort - 7;
                                                                break;
                                                        }
                                                    case -59:
                                                    case -58:
                                                    case -57:
                                                        break;
                                                }
                                            case -64:
                                            case -63:
                                            case -62:
                                            case -61:
                                                break;
                                        }
                                    } else {
                                        byte[] bArr = new byte[i11];
                                        if (bVar.read(bArr) == i11) {
                                            if (i(k0) == null) {
                                                this.f[1].put(k0, d.h(new String(bArr, j7)));
                                            }
                                            i11 = 0;
                                        } else {
                                            throw new IOException("Invalid exif");
                                        }
                                    }
                                } else {
                                    byte[] bArr2 = new byte[i11];
                                    bVar.readFully(bArr2);
                                    int i13 = i12 + i11;
                                    byte[] bArr3 = k7;
                                    if (C2834Eg0.h(bArr2, bArr3)) {
                                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i11);
                                        this.p = i8 + i12 + bArr3.length;
                                        j0(copyOfRange, i9);
                                        z0(new b(copyOfRange));
                                    } else {
                                        byte[] bArr4 = l7;
                                        if (C2834Eg0.h(bArr2, bArr4)) {
                                            int length = i12 + bArr4.length;
                                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i11);
                                            if (i(t2) == null) {
                                                this.f[0].put(t2, new d(1, copyOfRange2.length, length, copyOfRange2));
                                                this.u = true;
                                            }
                                        }
                                    }
                                    i12 = i13;
                                    i11 = 0;
                                }
                                if (i11 >= 0) {
                                    bVar.h(i11);
                                    i10 = i12 + i11;
                                } else {
                                    throw new IOException("Invalid length");
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
                    }
                }
            } else {
                throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
            }
        } else {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
    }

    public final void t0(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i8;
        char c8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (w) {
            Log.d(v, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + C9811tl1.d);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = Y5;
        C2834Eg0.f(bVar, cVar, bArr.length);
        byte[] bArr2 = Z5;
        bVar.h(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i13 = this.p;
                    if (i13 != 0) {
                        C2834Eg0.f(bVar, cVar2, (i13 - ((bArr.length + 4) + bArr2.length)) - 8);
                        bVar.h(4);
                        int readInt = bVar.readInt();
                        if (readInt % 2 != 0) {
                            readInt++;
                        }
                        bVar.h(readInt);
                        E0(cVar2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) == 4) {
                            byte[] bArr4 = e6;
                            boolean z8 = false;
                            boolean z9 = true;
                            if (Arrays.equals(bArr3, bArr4)) {
                                int readInt2 = bVar.readInt();
                                if (readInt2 % 2 == 1) {
                                    i12 = readInt2 + 1;
                                } else {
                                    i12 = readInt2;
                                }
                                byte[] bArr5 = new byte[i12];
                                bVar.read(bArr5);
                                byte b8 = (byte) (8 | bArr5[0]);
                                bArr5[0] = b8;
                                if (((b8 >> 1) & 1) == 1) {
                                    z8 = true;
                                }
                                cVar2.write(bArr4);
                                cVar2.f(readInt2);
                                cVar2.write(bArr5);
                                if (z8) {
                                    d(bVar, cVar2, h6, null);
                                    while (true) {
                                        byte[] bArr6 = new byte[4];
                                        inputStream.read(bArr6);
                                        if (!Arrays.equals(bArr6, i6)) {
                                            break;
                                        }
                                        e(bVar, cVar2, bArr6);
                                    }
                                    E0(cVar2);
                                } else {
                                    d(bVar, cVar2, g6, f6);
                                    E0(cVar2);
                                }
                            } else {
                                byte[] bArr7 = g6;
                                if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f6)) {
                                    int readInt3 = bVar.readInt();
                                    if (readInt3 % 2 == 1) {
                                        i8 = readInt3 + 1;
                                    } else {
                                        i8 = readInt3;
                                    }
                                    byte[] bArr8 = new byte[3];
                                    if (Arrays.equals(bArr3, bArr7)) {
                                        bVar.read(bArr8);
                                        byte[] bArr9 = new byte[3];
                                        c8 = '\b';
                                        if (bVar.read(bArr9) == 3 && Arrays.equals(c6, bArr9)) {
                                            i9 = bVar.readInt();
                                            i8 -= 10;
                                            i11 = (i9 << 2) >> 18;
                                            i10 = (i9 << 18) >> 18;
                                            z9 = false;
                                        } else {
                                            throw new IOException("Encountered error while checking VP8 signature");
                                        }
                                    } else {
                                        c8 = '\b';
                                        if (Arrays.equals(bArr3, f6)) {
                                            if (bVar.readByte() == 47) {
                                                i9 = bVar.readInt();
                                                i10 = (i9 & 16383) + 1;
                                                i11 = ((i9 & 268419072) >>> 14) + 1;
                                                if ((i9 & 268435456) == 0) {
                                                    z9 = false;
                                                }
                                                i8 -= 5;
                                            } else {
                                                throw new IOException("Encountered error while checking VP8L signature");
                                            }
                                        } else {
                                            i9 = 0;
                                            z9 = false;
                                            i10 = 0;
                                            i11 = 0;
                                        }
                                    }
                                    cVar2.write(bArr4);
                                    cVar2.f(10);
                                    byte[] bArr10 = new byte[10];
                                    if (z9) {
                                        bArr10[0] = (byte) (bArr10[0] | C8077mf.r);
                                    }
                                    bArr10[0] = (byte) (bArr10[0] | 8);
                                    int i14 = i10 - 1;
                                    int i15 = i11 - 1;
                                    bArr10[4] = (byte) i14;
                                    bArr10[5] = (byte) (i14 >> 8);
                                    bArr10[6] = (byte) (i14 >> 16);
                                    bArr10[7] = (byte) i15;
                                    bArr10[c8] = (byte) (i15 >> 8);
                                    bArr10[9] = (byte) (i15 >> 16);
                                    cVar2.write(bArr10);
                                    cVar2.write(bArr3);
                                    cVar2.f(readInt3);
                                    if (Arrays.equals(bArr3, bArr7)) {
                                        cVar2.write(bArr8);
                                        cVar2.write(c6);
                                        cVar2.f(i9);
                                    } else if (Arrays.equals(bArr3, f6)) {
                                        cVar2.write(47);
                                        cVar2.f(i9);
                                    }
                                    C2834Eg0.f(bVar, cVar2, i8);
                                    E0(cVar2);
                                }
                            }
                        } else {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                    }
                    C2834Eg0.e(bVar, cVar2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = Z5;
                    cVar.f(size + bArr11.length);
                    cVar.write(bArr11);
                    byteArrayOutputStream2.writeTo(cVar);
                    C2834Eg0.c(byteArrayOutputStream2);
                } catch (Exception e8) {
                    e = e8;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    C2834Eg0.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    @Deprecated
    public boolean u(float[] fArr) {
        double[] v8 = v();
        if (v8 == null) {
            return false;
        }
        fArr[0] = (float) v8[0];
        fArr[1] = (float) v8[1];
        return true;
    }

    public void u0(double d8) {
        String str;
        if (d8 >= 0.0d) {
            str = "0";
        } else {
            str = "1";
        }
        v0(D1, new h(Math.abs(d8)).toString());
        v0(C1, str);
    }

    public double[] v() {
        String i8 = i(z1);
        String i9 = i(y1);
        String i10 = i(B1);
        String i11 = i(A1);
        if (i8 != null && i9 != null && i10 != null && i11 != null) {
            try {
                return new double[]{c(i8, i9), c(i10, i11)};
            } catch (IllegalArgumentException unused) {
                Log.w(v, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", i8, i9, i10, i11));
                return null;
            }
        }
        return null;
    }

    public void v0(String str, String str2) {
        f fVar;
        int i8;
        int i9;
        int i10;
        String str3;
        int i11;
        String str4;
        Matcher matcher;
        String str5 = str;
        String str6 = str2;
        if (str5 != null) {
            boolean equals = U.equals(str5);
            String str7 = v;
            if ((equals || m0.equals(str5) || n0.equals(str5)) && str6 != null) {
                boolean find = W7.matcher(str6).find();
                boolean find2 = X7.matcher(str6).find();
                if (str6.length() == 19 && (find || find2)) {
                    if (find2) {
                        str6 = str6.replaceAll("-", ":");
                    }
                } else {
                    Log.w(v, "Invalid value for " + str5 + " : " + str6);
                    return;
                }
            }
            if (y0.equals(str5)) {
                if (w) {
                    Log.d(v, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str5 = z0;
            }
            int i12 = 2;
            int i13 = 1;
            if (str6 != null && h7.contains(str5)) {
                if (str5.equals(E1)) {
                    if (!V7.matcher(str6).find()) {
                        Log.w(v, "Invalid value for " + str5 + " : " + str6);
                        return;
                    }
                    str6 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                } else {
                    try {
                        str6 = new h(Double.parseDouble(str6)).toString();
                    } catch (NumberFormatException unused) {
                        Log.w(v, "Invalid value for " + str5 + " : " + str6);
                        return;
                    }
                }
            }
            int i14 = 0;
            int i15 = 0;
            while (i15 < d7.length) {
                if ((i15 != 4 || this.i) && (fVar = g7[i15].get(str5)) != null) {
                    if (str6 == null) {
                        this.f[i15].remove(str5);
                    } else {
                        Pair<Integer, Integer> J8 = J(str6);
                        if (fVar.c != ((Integer) J8.first).intValue() && fVar.c != ((Integer) J8.second).intValue()) {
                            int i16 = fVar.d;
                            if (i16 != -1 && (i16 == ((Integer) J8.first).intValue() || fVar.d == ((Integer) J8.second).intValue())) {
                                i8 = fVar.d;
                            } else {
                                int i17 = fVar.c;
                                if (i17 != i13 && i17 != 7 && i17 != i12) {
                                    if (w) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Given tag (");
                                        sb.append(str5);
                                        sb.append(") value didn't match with one of expected formats: ");
                                        String[] strArr = G6;
                                        sb.append(strArr[fVar.c]);
                                        String str8 = "";
                                        if (fVar.d == -1) {
                                            str4 = "";
                                        } else {
                                            str4 = C6566gU0.h + strArr[fVar.d];
                                        }
                                        sb.append(str4);
                                        sb.append(" (guess: ");
                                        sb.append(strArr[((Integer) J8.first).intValue()]);
                                        if (((Integer) J8.second).intValue() != -1) {
                                            str8 = C6566gU0.h + strArr[((Integer) J8.second).intValue()];
                                        }
                                        sb.append(str8);
                                        sb.append(C9811tl1.d);
                                        Log.d(str7, sb.toString());
                                    }
                                } else {
                                    i8 = i17;
                                }
                            }
                        } else {
                            i8 = fVar.c;
                        }
                        switch (i8) {
                            case 1:
                                i9 = i14;
                                i10 = i15;
                                str3 = str7;
                                i11 = i13;
                                this.f[i10].put(str5, d.a(str6));
                                break;
                            case 2:
                            case 7:
                                i9 = i14;
                                i10 = i15;
                                str3 = str7;
                                i11 = i13;
                                this.f[i10].put(str5, d.h(str6));
                                break;
                            case 3:
                                i9 = i14;
                                i10 = i15;
                                str3 = str7;
                                i11 = i13;
                                String[] split = str6.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i18 = i9; i18 < split.length; i18++) {
                                    iArr[i18] = Integer.parseInt(split[i18]);
                                }
                                this.f[i10].put(str5, d.n(iArr, this.h));
                                break;
                            case 4:
                                i9 = i14;
                                i10 = i15;
                                str3 = str7;
                                i11 = i13;
                                String[] split2 = str6.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i19 = i9; i19 < split2.length; i19++) {
                                    jArr[i19] = Long.parseLong(split2[i19]);
                                }
                                this.f[i10].put(str5, d.j(jArr, this.h));
                                break;
                            case 5:
                                i9 = i14;
                                i11 = i13;
                                String[] split3 = str6.split(",", -1);
                                h[] hVarArr = new h[split3.length];
                                int i20 = i9;
                                while (i20 < split3.length) {
                                    String[] split4 = split3[i20].split(RemoteSettings.i, -1);
                                    hVarArr[i20] = new h((long) Double.parseDouble(split4[i9]), (long) Double.parseDouble(split4[i11]));
                                    i20++;
                                    str7 = str7;
                                    i15 = i15;
                                }
                                i10 = i15;
                                str3 = str7;
                                this.f[i10].put(str5, d.l(hVarArr, this.h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (w) {
                                    Log.d(str7, "Data format isn't one of expected formats: " + i8);
                                    break;
                                }
                                break;
                            case 9:
                                i9 = i14;
                                i11 = i13;
                                String[] split5 = str6.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i21 = i9; i21 < split5.length; i21++) {
                                    iArr2[i21] = Integer.parseInt(split5[i21]);
                                }
                                this.f[i15].put(str5, d.e(iArr2, this.h));
                                i10 = i15;
                                str3 = str7;
                                break;
                            case 10:
                                String[] split6 = str6.split(",", -1);
                                h[] hVarArr2 = new h[split6.length];
                                int i22 = i14;
                                while (i22 < split6.length) {
                                    String[] split7 = split6[i22].split(RemoteSettings.i, -1);
                                    hVarArr2[i22] = new h((long) Double.parseDouble(split7[i14]), (long) Double.parseDouble(split7[i13]));
                                    i22++;
                                    i14 = i14;
                                    i13 = i13;
                                    split6 = split6;
                                }
                                i9 = i14;
                                i11 = i13;
                                this.f[i15].put(str5, d.g(hVarArr2, this.h));
                                i10 = i15;
                                str3 = str7;
                                break;
                            case 12:
                                String[] split8 = str6.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i23 = i14; i23 < split8.length; i23++) {
                                    dArr[i23] = Double.parseDouble(split8[i23]);
                                }
                                this.f[i15].put(str5, d.c(dArr, this.h));
                                break;
                        }
                        i15 = i10 + 1;
                        i14 = i9;
                        str7 = str3;
                        i13 = i11;
                        i12 = 2;
                    }
                }
                i9 = i14;
                i10 = i15;
                str3 = str7;
                i11 = i13;
                i15 = i10 + 1;
                i14 = i9;
                str7 = str3;
                i13 = i11;
                i12 = 2;
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final int w(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (S(bArr)) {
            return 4;
        }
        if (V(bArr)) {
            return 9;
        }
        if (R(bArr)) {
            return 12;
        }
        if (T(bArr)) {
            return 7;
        }
        if (W(bArr)) {
            return 10;
        }
        if (U(bArr)) {
            return 13;
        }
        if (d0(bArr)) {
            return 14;
        }
        return 0;
    }

    public void w0(Long l) {
        if (l != null) {
            if (l.longValue() >= 0) {
                String l8 = Long.toString(l.longValue() % 1000);
                for (int length = l8.length(); length < 3; length++) {
                    l8 = "0" + l8;
                }
                v0(U, m6.format(new Date(l.longValue())));
                v0(r0, l8);
                return;
            }
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        throw new NullPointerException("Timestamp should not be null.");
    }

    public final void x(i iVar) throws IOException {
        int i8;
        int i9;
        A(iVar);
        d dVar = this.f[1].get(j0);
        if (dVar != null) {
            i iVar2 = new i(dVar.d);
            iVar2.f(this.h);
            byte[] bArr = L5;
            byte[] bArr2 = new byte[bArr.length];
            iVar2.readFully(bArr2);
            iVar2.seek(0L);
            byte[] bArr3 = M5;
            byte[] bArr4 = new byte[bArr3.length];
            iVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iVar2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iVar2.seek(12L);
            }
            k0(iVar2, 6);
            d dVar2 = this.f[7].get(k2);
            d dVar3 = this.f[7].get(l2);
            if (dVar2 != null && dVar3 != null) {
                this.f[5].put(N, dVar2);
                this.f[5].put(O, dVar3);
            }
            d dVar4 = this.f[8].get(m2);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.r(this.h);
                if (iArr != null && iArr.length == 4) {
                    int i10 = iArr[2];
                    int i11 = iArr[0];
                    if (i10 > i11 && (i8 = iArr[3]) > (i9 = iArr[1])) {
                        int i12 = (i10 - i11) + 1;
                        int i13 = (i8 - i9) + 1;
                        if (i12 < i13) {
                            int i14 = i12 + i13;
                            i13 = i14 - i13;
                            i12 = i14 - i13;
                        }
                        d m = d.m(i12, this.h);
                        d m8 = d.m(i13, this.h);
                        this.f[0].put(x, m);
                        this.f[0].put(y, m8);
                        return;
                    }
                    return;
                }
                Log.w(v, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public void x0(Location location) {
        if (location == null) {
            return;
        }
        v0(Y1, location.getProvider());
        y0(location.getLatitude(), location.getLongitude());
        u0(location.getAltitude());
        v0(J1, "K");
        v0(K1, new h((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
        String[] split = m6.format(new Date(location.getTime())).split("\\s+", -1);
        v0(a2, split[0]);
        v0(E1, split[1]);
    }

    public final void y(b bVar) throws IOException {
        if (w) {
            Log.d(v, "getPngAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.BIG_ENDIAN);
        byte[] bArr = S5;
        bVar.h(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i8 = length + 8;
                    if (i8 == 16 && !Arrays.equals(bArr2, U5)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, V5)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, T5)) {
                        byte[] bArr3 = new byte[readInt];
                        if (bVar.read(bArr3) == readInt) {
                            int readInt2 = bVar.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.p = i8;
                                j0(bArr3, 0);
                                D0();
                                z0(new b(bArr3));
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C2834Eg0.a(bArr2));
                    }
                    int i9 = readInt + 4;
                    bVar.h(i9);
                    length = i8 + i9;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public void y0(double d8, double d9) {
        String str;
        String str2;
        if (d8 >= -90.0d && d8 <= 90.0d && !Double.isNaN(d8)) {
            if (d9 >= -180.0d && d9 <= 180.0d && !Double.isNaN(d9)) {
                if (d8 >= 0.0d) {
                    str = "N";
                } else {
                    str = "S";
                }
                v0(y1, str);
                v0(z1, b(Math.abs(d8)));
                if (d9 >= 0.0d) {
                    str2 = S4;
                } else {
                    str2 = T4;
                }
                v0(A1, str2);
                v0(B1, b(Math.abs(d9)));
                return;
            }
            throw new IllegalArgumentException("Longitude value " + d9 + " is not valid.");
        }
        throw new IllegalArgumentException("Latitude value " + d8 + " is not valid.");
    }

    public final void z(b bVar) throws IOException {
        boolean z8 = w;
        if (z8) {
            Log.d(v, "getRafAttributes starting with: " + bVar);
        }
        bVar.h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        int i10 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i9];
        bVar.h(i8 - bVar.a());
        bVar.read(bArr4);
        t(new b(bArr4), i8, 5);
        bVar.h(i10 - bVar.a());
        bVar.f(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z8) {
            Log.d(v, "numberOfDirectoryEntry: " + readInt);
        }
        for (int i11 = 0; i11 < readInt; i11++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == O6.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d m = d.m(readShort, this.h);
                d m8 = d.m(readShort2, this.h);
                this.f[0].put(y, m);
                this.f[0].put(x, m8);
                if (w) {
                    Log.d(v, "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.h(readUnsignedShort2);
        }
    }

    public final void z0(b bVar) throws IOException {
        HashMap<String, d> hashMap = this.f[4];
        d dVar = hashMap.get(A);
        if (dVar != null) {
            int p = dVar.p(this.h);
            this.f432o = p;
            if (p != 1) {
                if (p != 6) {
                    if (p != 7) {
                        return;
                    }
                } else {
                    K(bVar, hashMap);
                    return;
                }
            }
            if (Y(hashMap)) {
                L(bVar, hashMap);
                return;
            }
            return;
        }
        this.f432o = 6;
        K(bVar, hashMap);
    }

    /* renamed from: o.Cg0$i */
    /* loaded from: classes.dex */
    public static class i extends b {
        public i(byte[] bArr) throws IOException {
            super(bArr);
            this.X.mark(Integer.MAX_VALUE);
        }

        public void seek(long j) throws IOException {
            int i = this.Z;
            if (i > j) {
                this.Z = 0;
                this.X.reset();
            } else {
                j -= i;
            }
            h((int) j);
        }

        public i(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.X.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* renamed from: o.Cg0$f */
    /* loaded from: classes.dex */
    public static class f {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public f(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        public f(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public C2638Cg0(String str) throws IOException {
        f[][] fVarArr = d7;
        this.f = new HashMap[fVarArr.length];
        this.g = new HashSet(fVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            O(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public C2638Cg0(FileDescriptor fileDescriptor) throws IOException {
        boolean z8;
        FileInputStream fileInputStream;
        Throwable th;
        f[][] fVarArr = d7;
        this.f = new HashMap[fVarArr.length];
        this.g = new HashSet(fVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.c = null;
            this.a = null;
            if (X(fileDescriptor)) {
                this.b = fileDescriptor;
                try {
                    fileDescriptor = C2834Eg0.a.b(fileDescriptor);
                    z8 = true;
                } catch (Exception e8) {
                    throw new IOException("Failed to duplicate file descriptor", e8);
                }
            } else {
                this.b = null;
                z8 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
            } catch (Throwable th2) {
                fileInputStream = null;
                th = th2;
            }
            try {
                e0(fileInputStream);
                C2834Eg0.c(fileInputStream);
                if (z8) {
                    C2834Eg0.b(fileDescriptor);
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                C2834Eg0.c(fileInputStream);
                if (z8) {
                    C2834Eg0.b(fileDescriptor);
                }
                throw th;
            }
        }
        throw new NullPointerException("fileDescriptor cannot be null");
    }

    /* renamed from: o.Cg0$a */
    /* loaded from: classes.dex */
    public class a extends MediaDataSource {
        public long X;
        public final /* synthetic */ i Y;

        public a(i iVar) {
            this.Y = iVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.X;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.Y.available()) {
                        return -1;
                    }
                    this.Y.seek(j);
                    this.X = j;
                }
                if (i2 > this.Y.available()) {
                    i2 = this.Y.available();
                }
                int read = this.Y.read(bArr, i, i2);
                if (read >= 0) {
                    this.X += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.X = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public C2638Cg0(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public C2638Cg0(InputStream inputStream, int i8) throws IOException {
        f[][] fVarArr = d7;
        this.f = new HashMap[fVarArr.length];
        this.g = new HashSet(fVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            if (i8 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, k7.length);
                if (!P(bufferedInputStream)) {
                    Log.w(v, "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.e = true;
                this.c = null;
                this.b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (X(fileInputStream.getFD())) {
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    }
                }
                this.c = null;
                this.b = null;
            }
            e0(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
