package o;

import java.net.URLConnection;

/* renamed from: o.Sj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4228Sj1 {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (guessContentTypeFromName != null) {
            return guessContentTypeFromName;
        }
        return b(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r5.equals("mhtml") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str) {
        char c = '.';
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        String lowerCase = str.substring(lastIndexOf + 1).toLowerCase();
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 3315:
                if (lowerCase.equals("gz")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3401:
                if (lowerCase.equals("js")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 97669:
                if (lowerCase.equals("bmp")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 98819:
                if (lowerCase.equals("css")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 102340:
                if (lowerCase.equals(JT.e)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 103649:
                if (lowerCase.equals("htm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 104085:
                if (lowerCase.equals("ico")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 105441:
                if (lowerCase.equals("jpg")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 106458:
                if (lowerCase.equals("m4a")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 106479:
                if (lowerCase.equals("m4v")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 108089:
                if (lowerCase.equals("mht")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 108150:
                if (lowerCase.equals("mjs")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    c = C8206nB.d;
                    break;
                }
                c = 65535;
                break;
            case 108324:
                if (lowerCase.equals("mpg")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 109961:
                if (lowerCase.equals("oga")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 109967:
                if (lowerCase.equals("ogg")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 109973:
                if (lowerCase.equals("ogm")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 109982:
                if (lowerCase.equals("ogv")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 110834:
                if (lowerCase.equals("pdf")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 111030:
                if (lowerCase.equals("pjp")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 111145:
                if (lowerCase.equals("png")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 114276:
                if (lowerCase.equals("svg")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 114791:
                if (lowerCase.equals("tgz")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 114833:
                if (lowerCase.equals("tif")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 117484:
                if (lowerCase.equals("wav")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 118660:
                if (lowerCase.equals("xht")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 118807:
                if (lowerCase.equals(C2730De2.w)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 120609:
                if (lowerCase.equals("zip")) {
                    c = C5588cW.n;
                    break;
                }
                c = 65535;
                break;
            case 3000872:
                if (lowerCase.equals("apng")) {
                    c = C5588cW.f706o;
                    break;
                }
                c = 65535;
                break;
            case 3145576:
                if (lowerCase.equals("flac")) {
                    c = C5588cW.p;
                    break;
                }
                c = 65535;
                break;
            case 3213227:
                if (lowerCase.equals("html")) {
                    c = VN2.b;
                    break;
                }
                c = 65535;
                break;
            case 3259225:
                if (lowerCase.equals("jfif")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 3268712:
                if (lowerCase.equals("jpeg")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 3271912:
                if (lowerCase.equals(com.facebook.S.B)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 3358085:
                if (lowerCase.equals("mpeg")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 3418175:
                if (lowerCase.equals("opus")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 3529614:
                if (lowerCase.equals("shtm")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 3542678:
                if (lowerCase.equals("svgz")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 3559925:
                if (lowerCase.equals("tiff")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 3642020:
                if (lowerCase.equals("wasm")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 3645337:
                if (lowerCase.equals(C10997yd1.n0)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 3645340:
                if (lowerCase.equals("webp")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 3655064:
                if (lowerCase.equals("woff")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 3678569:
                if (lowerCase.equals("xhtm")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 96488848:
                if (lowerCase.equals("ehtml")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 103877016:
                break;
            case 106703064:
                if (lowerCase.equals("pjpeg")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 109418142:
                if (lowerCase.equals("shtml")) {
                    c = C3599Ly1.j;
                    break;
                }
                c = 65535;
                break;
            case 114035747:
                if (lowerCase.equals("xhtml")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 23:
                return "application/gzip";
            case 1:
            case 11:
                return "application/javascript";
            case 2:
                return "image/bmp";
            case 3:
                return "text/css";
            case 4:
                return "image/gif";
            case 5:
            case 31:
            case '%':
            case '-':
            case '0':
                return "text/html";
            case 6:
                return "image/x-icon";
            case 7:
            case 20:
            case ' ':
            case '!':
            case '/':
                return C4128Rj1.R0;
            case '\b':
                return "audio/x-m4a";
            case '\t':
            case '\r':
                return C4128Rj1.f;
            case '\n':
            case '.':
                return "multipart/related";
            case '\f':
                return C4128Rj1.I;
            case 14:
            case '#':
                return C4128Rj1.q;
            case 15:
            case 16:
            case '$':
                return C4128Rj1.h0;
            case 17:
            case 18:
                return C4128Rj1.x;
            case 19:
                return "application/pdf";
            case 21:
                return C4128Rj1.P0;
            case 22:
            case '&':
                return "image/svg+xml";
            case 24:
            case '\'':
                return "image/tiff";
            case 25:
                return C4128Rj1.i0;
            case 26:
            case ',':
            case '1':
                return "application/xhtml+xml";
            case 27:
                return "text/xml";
            case 28:
                return "application/zip";
            case 29:
                return "image/apng";
            case 30:
                return C4128Rj1.e0;
            case '\"':
                return "application/json";
            case '(':
                return "application/wasm";
            case ')':
                return "video/webm";
            case '*':
                return C4128Rj1.Q0;
            case '+':
                return "application/font-woff";
            default:
                return null;
        }
    }
}
