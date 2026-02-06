package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import o.C10833xx0;
import o.C4224Si1;

@Deprecated
/* renamed from: o.lj1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7834lj1 {
    public static final int A = 1885823344;
    public static final int B = 1936683886;
    public static final int C = 1953919848;
    public static final int D = 757935405;
    public static final int E = 3;
    @InterfaceC5056aJ2
    public static final String[] F = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", AI0.J0, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final int G = 169;
    public static final int H = 253;
    public static final String a = "MetadataUtil";
    public static final int b = 7233901;
    public static final int c = 7631467;
    public static final int d = 6516084;
    public static final int e = 6578553;
    public static final int f = 4280916;
    public static final int g = 7630703;
    public static final int h = 6384738;
    public static final int i = 6516589;
    public static final int j = 7828084;
    public static final int k = 7108978;
    public static final int l = 6776174;
    public static final int m = 1668249202;
    public static final int n = 1735291493;

    /* renamed from: o  reason: collision with root package name */
    public static final int f798o = 6779504;
    public static final int p = 1684632427;
    public static final int q = 1953655662;
    public static final int r = 1953329263;
    public static final int s = 1668311404;
    public static final int t = 1631670868;
    public static final int u = 1936682605;
    public static final int v = 1936679276;
    public static final int w = 1936679282;
    public static final int x = 1936679265;
    public static final int y = 1936679791;
    public static final int z = 1920233063;

    @InterfaceC11300zs1
    public static KG a(int i2, C3012Fy1 c3012Fy1) {
        int s2 = c3012Fy1.s();
        if (c3012Fy1.s() == 1684108385) {
            c3012Fy1.Z(8);
            String G2 = c3012Fy1.G(s2 - 16);
            return new KG(C10323vs.g1, G2, G2);
        }
        I31.n(a, "Failed to parse comment attribute: " + AbstractC4501Vf.a(i2));
        return null;
    }

    @InterfaceC11300zs1
    public static C2617Cb b(C3012Fy1 c3012Fy1) {
        String str;
        int s2 = c3012Fy1.s();
        if (c3012Fy1.s() == 1684108385) {
            int b2 = AbstractC4501Vf.b(c3012Fy1.s());
            if (b2 == 13) {
                str = C4128Rj1.R0;
            } else if (b2 == 14) {
                str = C4128Rj1.P0;
            } else {
                str = null;
            }
            if (str == null) {
                I31.n(a, "Unrecognized cover art flags: " + b2);
                return null;
            }
            c3012Fy1.Z(4);
            int i2 = s2 - 16;
            byte[] bArr = new byte[i2];
            c3012Fy1.n(bArr, 0, i2);
            return new C2617Cb(str, null, 3, bArr);
        }
        I31.n(a, "Failed to parse cover art attribute");
        return null;
    }

    @InterfaceC11300zs1
    public static C4224Si1.b c(C3012Fy1 c3012Fy1) {
        int f2 = c3012Fy1.f() + c3012Fy1.s();
        int s2 = c3012Fy1.s();
        int i2 = (s2 >> 24) & 255;
        try {
            if (i2 != 169 && i2 != 253) {
                if (s2 == 1735291493) {
                    return g(c3012Fy1);
                }
                if (s2 == 1684632427) {
                    return d(s2, "TPOS", c3012Fy1);
                }
                if (s2 == 1953655662) {
                    return d(s2, "TRCK", c3012Fy1);
                }
                if (s2 == 1953329263) {
                    return i(s2, "TBPM", c3012Fy1, true, false);
                }
                if (s2 == 1668311404) {
                    return i(s2, "TCMP", c3012Fy1, true, true);
                }
                if (s2 == 1668249202) {
                    return b(c3012Fy1);
                }
                if (s2 == 1631670868) {
                    return h(s2, "TPE2", c3012Fy1);
                }
                if (s2 == 1936682605) {
                    return h(s2, "TSOT", c3012Fy1);
                }
                if (s2 == 1936679276) {
                    return h(s2, "TSO2", c3012Fy1);
                }
                if (s2 == 1936679282) {
                    return h(s2, "TSOA", c3012Fy1);
                }
                if (s2 == 1936679265) {
                    return h(s2, "TSOP", c3012Fy1);
                }
                if (s2 == 1936679791) {
                    return h(s2, "TSOC", c3012Fy1);
                }
                if (s2 == 1920233063) {
                    return i(s2, "ITUNESADVISORY", c3012Fy1, false, false);
                }
                if (s2 == 1885823344) {
                    return i(s2, "ITUNESGAPLESS", c3012Fy1, false, true);
                }
                if (s2 == 1936683886) {
                    return h(s2, "TVSHOWSORT", c3012Fy1);
                }
                if (s2 == 1953919848) {
                    return h(s2, "TVSHOW", c3012Fy1);
                }
                if (s2 == 757935405) {
                    return e(c3012Fy1, f2);
                }
            } else {
                int i3 = 16777215 & s2;
                if (i3 == 6516084) {
                    return a(s2, c3012Fy1);
                }
                if (i3 != 7233901 && i3 != 7631467) {
                    if (i3 != 6516589 && i3 != 7828084) {
                        if (i3 == 6578553) {
                            return h(s2, "TDRC", c3012Fy1);
                        }
                        if (i3 == 4280916) {
                            return h(s2, "TPE1", c3012Fy1);
                        }
                        if (i3 == 7630703) {
                            return h(s2, "TSSE", c3012Fy1);
                        }
                        if (i3 == 6384738) {
                            return h(s2, "TALB", c3012Fy1);
                        }
                        if (i3 == 7108978) {
                            return h(s2, "USLT", c3012Fy1);
                        }
                        if (i3 == 6776174) {
                            return h(s2, "TCON", c3012Fy1);
                        }
                        if (i3 == 6779504) {
                            return h(s2, "TIT1", c3012Fy1);
                        }
                    } else {
                        return h(s2, "TCOM", c3012Fy1);
                    }
                } else {
                    return h(s2, "TIT2", c3012Fy1);
                }
            }
            I31.b(a, "Skipped unknown metadata entry: " + AbstractC4501Vf.a(s2));
            c3012Fy1.Y(f2);
            return null;
        } finally {
            c3012Fy1.Y(f2);
        }
    }

    @InterfaceC11300zs1
    public static C2566Bm2 d(int i2, String str, C3012Fy1 c3012Fy1) {
        int s2 = c3012Fy1.s();
        if (c3012Fy1.s() == 1684108385 && s2 >= 22) {
            c3012Fy1.Z(10);
            int R = c3012Fy1.R();
            if (R > 0) {
                String str2 = "" + R;
                int R2 = c3012Fy1.R();
                if (R2 > 0) {
                    str2 = str2 + RemoteSettings.i + R2;
                }
                return new C2566Bm2(str, (String) null, AbstractC5317bO0.M(str2));
            }
        }
        I31.n(a, "Failed to parse index/count attribute: " + AbstractC4501Vf.a(i2));
        return null;
    }

    @InterfaceC11300zs1
    public static LL0 e(C3012Fy1 c3012Fy1, int i2) {
        String str = null;
        String str2 = null;
        int i3 = -1;
        int i4 = -1;
        while (c3012Fy1.f() < i2) {
            int f2 = c3012Fy1.f();
            int s2 = c3012Fy1.s();
            int s3 = c3012Fy1.s();
            c3012Fy1.Z(4);
            if (s3 == 1835360622) {
                str = c3012Fy1.G(s2 - 12);
            } else if (s3 == 1851878757) {
                str2 = c3012Fy1.G(s2 - 12);
            } else {
                if (s3 == 1684108385) {
                    i3 = f2;
                    i4 = s2;
                }
                c3012Fy1.Z(s2 - 12);
            }
        }
        if (str == null || str2 == null || i3 == -1) {
            return null;
        }
        c3012Fy1.Y(i3);
        c3012Fy1.Z(16);
        return new C11201zS0(str, str2, c3012Fy1.G(i4 - 16));
    }

    @InterfaceC11300zs1
    public static C3128Hd1 f(C3012Fy1 c3012Fy1, int i2, String str) {
        while (true) {
            int f2 = c3012Fy1.f();
            if (f2 < i2) {
                int s2 = c3012Fy1.s();
                if (c3012Fy1.s() == 1684108385) {
                    int s3 = c3012Fy1.s();
                    int s4 = c3012Fy1.s();
                    int i3 = s2 - 16;
                    byte[] bArr = new byte[i3];
                    c3012Fy1.n(bArr, 0, i3);
                    return new C3128Hd1(str, bArr, s4, s3);
                }
                c3012Fy1.Y(f2 + s2);
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2566Bm2 g(C3012Fy1 c3012Fy1) {
        String str;
        int j2 = j(c3012Fy1);
        if (j2 > 0) {
            String[] strArr = F;
            if (j2 <= strArr.length) {
                str = strArr[j2 - 1];
                if (str == null) {
                    return new C2566Bm2("TCON", (String) null, AbstractC5317bO0.M(str));
                }
                I31.n(a, "Failed to parse standard genre code");
                return null;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    @InterfaceC11300zs1
    public static C2566Bm2 h(int i2, String str, C3012Fy1 c3012Fy1) {
        int s2 = c3012Fy1.s();
        if (c3012Fy1.s() == 1684108385) {
            c3012Fy1.Z(8);
            return new C2566Bm2(str, (String) null, AbstractC5317bO0.M(c3012Fy1.G(s2 - 16)));
        }
        I31.n(a, "Failed to parse text attribute: " + AbstractC4501Vf.a(i2));
        return null;
    }

    @InterfaceC11300zs1
    public static LL0 i(int i2, String str, C3012Fy1 c3012Fy1, boolean z2, boolean z3) {
        int j2 = j(c3012Fy1);
        if (z3) {
            j2 = Math.min(1, j2);
        }
        if (j2 >= 0) {
            if (z2) {
                return new C2566Bm2(str, (String) null, AbstractC5317bO0.M(Integer.toString(j2)));
            }
            return new KG(C10323vs.g1, str, Integer.toString(j2));
        }
        I31.n(a, "Failed to parse uint8 attribute: " + AbstractC4501Vf.a(i2));
        return null;
    }

    public static int j(C3012Fy1 c3012Fy1) {
        c3012Fy1.Z(4);
        if (c3012Fy1.s() == 1684108385) {
            c3012Fy1.Z(8);
            return c3012Fy1.L();
        }
        I31.n(a, "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i2, BC0 bc0, C10833xx0.b bVar) {
        if (i2 == 1 && bc0.a()) {
            bVar.P(bc0.a).Q(bc0.b);
        }
    }

    public static void l(int i2, @InterfaceC11300zs1 C4224Si1 c4224Si1, @InterfaceC11300zs1 C4224Si1 c4224Si12, C10833xx0.b bVar, C4224Si1... c4224Si1Arr) {
        C4224Si1 c4224Si13 = new C4224Si1(new C4224Si1.b[0]);
        if (i2 != 1 || c4224Si1 == null) {
            c4224Si1 = c4224Si13;
        }
        if (c4224Si12 != null) {
            for (int i3 = 0; i3 < c4224Si12.e(); i3++) {
                C4224Si1.b d2 = c4224Si12.d(i3);
                if (d2 instanceof C3128Hd1) {
                    C3128Hd1 c3128Hd1 = (C3128Hd1) d2;
                    if (c3128Hd1.X.equals(C3128Hd1.Z0)) {
                        if (i2 == 2) {
                            c4224Si1 = c4224Si1.a(c3128Hd1);
                        }
                    } else {
                        c4224Si1 = c4224Si1.a(c3128Hd1);
                    }
                }
            }
        }
        for (C4224Si1 c4224Si14 : c4224Si1Arr) {
            c4224Si1 = c4224Si1.b(c4224Si14);
        }
        if (c4224Si1.e() > 0) {
            bVar.Z(c4224Si1);
        }
    }
}
