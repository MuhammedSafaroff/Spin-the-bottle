package com.muhammedsafaroff.spinthebottle;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    ImageView bottle;
     Random random = new Random();
     int lastDir;
     boolean spinning;
     boolean buttonDurum;
    Button dogruluk_btn,cesaret_btn;
    Context context=this;
    ArrayList<String> dogrulukList,cesaretList;
    AlertDialog.Builder builder;
    private AdView mAdView;
    DataHelper dat = new DataHelper(context);
    TextView txt_ad_21,txt_ad_22,txt_ad_31,txt_ad_32,txt_ad_33,txt_ad_41,txt_ad_42,txt_ad_43,txt_ad_44,txt_ad_51,txt_ad_52,txt_ad_53,txt_ad_54,txt_ad_55,txt_ad_61,txt_ad_62,txt_ad_63,txt_ad_64,txt_ad_65,txt_ad_66,txt_ad_71,txt_ad_72,txt_ad_73,txt_ad_74,txt_ad_75,txt_ad_76,txt_ad_77,txt_ad_81,txt_ad_82,txt_ad_83,txt_ad_84,txt_ad_85,txt_ad_86,txt_ad_87,txt_ad_88,txt_ad_91,txt_ad_92,txt_ad_93,txt_ad_94,txt_ad_95,txt_ad_96,txt_ad_97,txt_ad_98,txt_ad_99,txt_ad_101,txt_ad_102,txt_ad_103,txt_ad_104,txt_ad_105,txt_ad_106,txt_ad_107,txt_ad_108,txt_ad_109,txt_ad_1010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (dat.receiveDataInt("number",2)){
            case 2 :
                    setContentView(R.layout.activity_main);
                    init();
                    init2();
            break;
            case 3 :
                    setContentView(R.layout.activity_main3);
                    init();
                    init3();
            break;
            case 4 :
                    setContentView(R.layout.activity_main4);
                    init();
                    init4();
                break;
            case 5 :
                    setContentView(R.layout.activity_main5);
                    init();
                    init5();
                break;
            case 6 :
                    setContentView(R.layout.activity_main6);
                    init();
                    init6();
                break;
            case 7 :
                    setContentView(R.layout.activity_main7);
                    init();
                    init7();
                break;
            case 8 :
                    setContentView(R.layout.activity_main8);
                    init();
                    init8();
                break;
            case 9 :
                    setContentView(R.layout.activity_main9);
                    init();
                    init9();
                break;
            case 10 :
                    setContentView(R.layout.activity_main10);
                    init();
                    init10();
                break;
        }

        reklam();



        //toast butona tikla

        Toast.makeText(context,"Başlamak İçin Şişeye Dokunun!",Toast.LENGTH_LONG).show();
        //toast

        String dogruArray[] = new String[]{getString(R.string.soru1),getString(R.string.soru2),getString(R.string.soru3),getString(R.string.soru4),getString(R.string.soru5),getString(R.string.soru6),getString(R.string.soru7),getString(R.string.soru8),getString(R.string.soru10),getString(R.string.soru11),getString(R.string.soru12),getString(R.string.soru13),getString(R.string.soru14),getString(R.string.soru15),getString(R.string.soru16),getString(R.string.soru17),getString(R.string.soru18),getString(R.string.soru19),getString(R.string.soru20),getString(R.string.soru21),getString(R.string.soru22),getString(R.string.soru23),getString(R.string.soru24),getString(R.string.soru25),getString(R.string.soru26),getString(R.string.soru27),getString(R.string.soru28),getString(R.string.soru29),getString(R.string.soru30),getString(R.string.soru31),getString(R.string.soru32),getString(R.string.soru33),getString(R.string.soru34),getString(R.string.soru35),getString(R.string.soru36),getString(R.string.soru37),getString(R.string.soru38),getString(R.string.soru39),getString(R.string.soru40),getString(R.string.soru41),getString(R.string.soru42),getString(R.string.soru43),getString(R.string.soru44),getString(R.string.soru45),getString(R.string.soru46),getString(R.string.soru47),getString(R.string.soru48),getString(R.string.soru49),getString(R.string.soru50),getString(R.string.soru51),getString(R.string.soru52),getString(R.string.soru53),getString(R.string.soru54),getString(R.string.soru55),getString(R.string.soru56),getString(R.string.soru57),getString(R.string.soru58),getString(R.string.soru59),getString(R.string.soru60),getString(R.string.soru61),getString(R.string.soru62),getString(R.string.soru63),getString(R.string.soru64),getString(R.string.soru65),getString(R.string.soru66),getString(R.string.soru67),getString(R.string.soru68),getString(R.string.soru69),getString(R.string.soru70),getString(R.string.soru71),getString(R.string.soru72),getString(R.string.soru73),getString(R.string.soru74),getString(R.string.soru75),getString(R.string.soru76),getString(R.string.soru77),getString(R.string.soru78),getString(R.string.soru79),getString(R.string.soru80),getString(R.string.soru81),getString(R.string.soru82),getString(R.string.soru83),getString(R.string.soru84),getString(R.string.soru85),getString(R.string.soru86),getString(R.string.soru87),getString(R.string.soru88),getString(R.string.soru89),getString(R.string.soru90),getString(R.string.soru91),getString(R.string.soru92),getString(R.string.soru93),getString(R.string.soru94),getString(R.string.soru95),getString(R.string.soru96),getString(R.string.soru97),getString(R.string.soru98),getString(R.string.soru99),getString(R.string.soru100),getString(R.string.soru101),getString(R.string.soru102),getString(R.string.soru103),getString(R.string.soru104),getString(R.string.soru105),getString(R.string.soru106),getString(R.string.soru107),getString(R.string.soru108),getString(R.string.soru109),getString(R.string.soru110),getString(R.string.soru111),getString(R.string.soru112),getString(R.string.soru113),getString(R.string.soru114),getString(R.string.soru115),getString(R.string.soru116),getString(R.string.soru117),getString(R.string.soru118),getString(R.string.soru119),getString(R.string.soru120),getString(R.string.soru121),getString(R.string.soru122),getString(R.string.soru123),getString(R.string.soru124),getString(R.string.soru125),getString(R.string.soru126),getString(R.string.soru127),getString(R.string.soru128),getString(R.string.soru129),getString(R.string.soru130),getString(R.string.soru131),getString(R.string.soru132),getString(R.string.soru133),getString(R.string.soru134),getString(R.string.soru135),getString(R.string.soru136),getString(R.string.soru137),getString(R.string.soru138),getString(R.string.soru139),getString(R.string.soru140),getString(R.string.soru141),getString(R.string.soru142),getString(R.string.soru143),getString(R.string.soru144),getString(R.string.soru145),getString(R.string.soru146),getString(R.string.soru147),getString(R.string.soru148),getString(R.string.soru149),getString(R.string.soru150),getString(R.string.soru151),getString(R.string.soru152),getString(R.string.soru153),getString(R.string.soru154),getString(R.string.soru155),getString(R.string.soru156),getString(R.string.soru157),getString(R.string.soru158),getString(R.string.soru159),getString(R.string.soru160),getString(R.string.soru161),getString(R.string.soru162),getString(R.string.soru163),getString(R.string.soru164),getString(R.string.soru165),getString(R.string.soru166),getString(R.string.soru167),getString(R.string.soru168),getString(R.string.soru169),getString(R.string.soru170),getString(R.string.soru171),getString(R.string.soru172),getString(R.string.soru173),getString(R.string.soru174),getString(R.string.soru175),getString(R.string.soru176),getString(R.string.soru177),getString(R.string.soru178),getString(R.string.soru179),getString(R.string.soru180),getString(R.string.soru181),getString(R.string.soru182),getString(R.string.soru183),getString(R.string.soru184),getString(R.string.soru185),getString(R.string.soru186),getString(R.string.soru187),getString(R.string.soru188),getString(R.string.soru189),getString(R.string.soru190),getString(R.string.soru191),getString(R.string.soru192),getString(R.string.soru193),getString(R.string.soru194),getString(R.string.soru195),getString(R.string.soru196),getString(R.string.soru197),getString(R.string.soru198),getString(R.string.soru199),getString(R.string.soru200),getString(R.string.soru201),getString(R.string.soru202),getString(R.string.soru203),getString(R.string.soru204),getString(R.string.soru205),getString(R.string.soru206),getString(R.string.soru207),getString(R.string.soru208),getString(R.string.soru209),getString(R.string.soru210),getString(R.string.soru211),getString(R.string.soru212),getString(R.string.soru213),getString(R.string.soru214),getString(R.string.soru215),getString(R.string.soru216),getString(R.string.soru217),getString(R.string.soru218),getString(R.string.soru219),getString(R.string.soru220),getString(R.string.soru221),getString(R.string.soru222),getString(R.string.soru223),getString(R.string.soru224),getString(R.string.soru225),getString(R.string.soru226),getString(R.string.soru227),getString(R.string.soru228),getString(R.string.soru229),getString(R.string.soru230),getString(R.string.soru231),getString(R.string.soru232),getString(R.string.soru233),getString(R.string.soru234),getString(R.string.soru235),getString(R.string.soru236),getString(R.string.soru237),getString(R.string.soru238),getString(R.string.soru239),getString(R.string.soru240),getString(R.string.soru241),getString(R.string.soru242),getString(R.string.soru243),getString(R.string.soru244),getString(R.string.soru245),getString(R.string.soru246),getString(R.string.soru247),getString(R.string.soru248),getString(R.string.soru249),getString(R.string.soru250),getString(R.string.soru251),getString(R.string.soru252),getString(R.string.soru253),getString(R.string.soru254),getString(R.string.soru255),getString(R.string.soru256),getString(R.string.soru257),getString(R.string.soru258),getString(R.string.soru259),getString(R.string.soru260),getString(R.string.soru261),getString(R.string.soru262),getString(R.string.soru263),getString(R.string.soru264),getString(R.string.soru265),getString(R.string.soru266),getString(R.string.soru267),getString(R.string.soru268),getString(R.string.soru269),getString(R.string.soru270),getString(R.string.soru271),getString(R.string.soru272),getString(R.string.soru273),getString(R.string.soru274),getString(R.string.soru275),getString(R.string.soru276),getString(R.string.soru277),getString(R.string.soru278),getString(R.string.soru279),getString(R.string.soru280),getString(R.string.soru281),getString(R.string.soru282),getString(R.string.soru283),getString(R.string.soru284),getString(R.string.soru285),getString(R.string.soru286),getString(R.string.soru287),getString(R.string.soru288),getString(R.string.soru289),getString(R.string.soru290),getString(R.string.soru291),getString(R.string.soru292),getString(R.string.soru293),getString(R.string.soru294),getString(R.string.soru295),getString(R.string.soru296),getString(R.string.soru297),getString(R.string.soru298),getString(R.string.soru299),getString(R.string.soru300),getString(R.string.soru301),getString(R.string.soru302),getString(R.string.soru303),getString(R.string.soru304),getString(R.string.soru305),getString(R.string.soru306),getString(R.string.soru307),getString(R.string.soru308),getString(R.string.soru309),getString(R.string.soru310),getString(R.string.soru311),getString(R.string.soru312),getString(R.string.soru313),getString(R.string.soru314),getString(R.string.soru315),getString(R.string.soru316),getString(R.string.soru317),getString(R.string.soru318),getString(R.string.soru319),getString(R.string.soru320),getString(R.string.soru321),getString(R.string.soru322),getString(R.string.soru323),getString(R.string.soru324),getString(R.string.soru325),getString(R.string.soru326),getString(R.string.soru327),getString(R.string.soru328),getString(R.string.soru329),getString(R.string.soru330),getString(R.string.soru331),getString(R.string.soru332),getString(R.string.soru333),getString(R.string.soru334),getString(R.string.soru335),getString(R.string.soru336),getString(R.string.soru337),getString(R.string.soru338),getString(R.string.soru339),getString(R.string.soru340),getString(R.string.soru341),getString(R.string.soru342),getString(R.string.soru343),getString(R.string.soru344),getString(R.string.soru345),getString(R.string.soru346),getString(R.string.soru347),getString(R.string.soru348),getString(R.string.soru349),getString(R.string.soru350),getString(R.string.soru360),getString(R.string.soru361),getString(R.string.soru362),getString(R.string.soru363),getString(R.string.soru364),getString(R.string.soru365),getString(R.string.soru366),getString(R.string.soru367),getString(R.string.soru368),getString(R.string.soru369),getString(R.string.soru370),getString(R.string.soru371),getString(R.string.soru372),getString(R.string.soru373),getString(R.string.soru374),getString(R.string.soru375),getString(R.string.soru376),getString(R.string.soru377),getString(R.string.soru378),getString(R.string.soru379),getString(R.string.soru380),getString(R.string.soru381),getString(R.string.soru382),getString(R.string.soru383),getString(R.string.soru384),getString(R.string.soru385),getString(R.string.soru386),getString(R.string.soru387),getString(R.string.soru388),getString(R.string.soru389),getString(R.string.soru390),getString(R.string.soru391),getString(R.string.soru392),getString(R.string.soru393),getString(R.string.soru394),getString(R.string.soru395),getString(R.string.soru396),getString(R.string.soru397),getString(R.string.soru398),getString(R.string.soru399),getString(R.string.soru400),getString(R.string.soru401),getString(R.string.soru402),getString(R.string.soru403),getString(R.string.soru404),getString(R.string.soru405),getString(R.string.soru406),getString(R.string.soru407),getString(R.string.soru408),getString(R.string.soru409),getString(R.string.soru410),getString(R.string.soru411),getString(R.string.soru412),getString(R.string.soru413),getString(R.string.soru414),getString(R.string.soru415),getString(R.string.soru416),getString(R.string.soru417),getString(R.string.soru418),getString(R.string.soru419),getString(R.string.soru420),getString(R.string.soru421),getString(R.string.soru422),getString(R.string.soru423),getString(R.string.soru424),getString(R.string.soru425),getString(R.string.soru426),getString(R.string.soru427),getString(R.string.soru428),getString(R.string.soru429),getString(R.string.soru430),getString(R.string.soru431),getString(R.string.soru432),getString(R.string.soru433),getString(R.string.soru434),getString(R.string.soru435),getString(R.string.soru436)};
        String cesaretArray[] = new String[]{getString(R.string.c1),getString(R.string.c2),getString(R.string.c3),getString(R.string.c4),getString(R.string.c5),getString(R.string.c6),getString(R.string.c7),getString(R.string.c8),getString(R.string.c9),getString(R.string.c10),getString(R.string.c11),getString(R.string.c12),getString(R.string.c13),getString(R.string.c14),getString(R.string.c15),getString(R.string.c16),getString(R.string.c17),getString(R.string.c18),getString(R.string.c19),getString(R.string.c20),getString(R.string.c21),getString(R.string.c22),getString(R.string.c23),getString(R.string.c24),getString(R.string.c25),getString(R.string.c26),getString(R.string.c27),getString(R.string.c28),getString(R.string.c29),getString(R.string.c30),getString(R.string.c31),getString(R.string.c32),getString(R.string.c33),getString(R.string.c34),getString(R.string.c35),getString(R.string.c36),getString(R.string.c37),getString(R.string.c38),getString(R.string.c39),getString(R.string.c40),getString(R.string.c41),getString(R.string.c42),getString(R.string.c43),getString(R.string.c44),getString(R.string.c45),getString(R.string.c46),getString(R.string.c47),getString(R.string.c48),getString(R.string.c49),getString(R.string.c50),getString(R.string.c51),getString(R.string.c52),getString(R.string.c53),getString(R.string.c54),getString(R.string.c55),getString(R.string.c56),getString(R.string.c57),getString(R.string.c58),getString(R.string.c59),getString(R.string.c60),getString(R.string.c61),getString(R.string.c62),getString(R.string.c63),getString(R.string.c64),getString(R.string.c65),getString(R.string.c66),getString(R.string.c67),getString(R.string.c68),getString(R.string.c69),getString(R.string.c70),getString(R.string.c71),getString(R.string.c72),getString(R.string.c73),getString(R.string.c74),getString(R.string.c75),getString(R.string.c76),getString(R.string.c77),getString(R.string.c78),getString(R.string.c79),getString(R.string.c80),getString(R.string.c81),getString(R.string.c82),getString(R.string.c83),getString(R.string.c84),getString(R.string.c85),getString(R.string.c86),getString(R.string.c87),getString(R.string.c88),getString(R.string.c89),getString(R.string.c90),getString(R.string.c91),getString(R.string.c92),getString(R.string.c93),getString(R.string.c94),getString(R.string.c95),getString(R.string.c96),getString(R.string.c97),getString(R.string.c98),getString(R.string.c99),getString(R.string.c100),getString(R.string.c101),getString(R.string.c102),getString(R.string.c103),getString(R.string.c104),getString(R.string.c105),getString(R.string.c106),getString(R.string.c107),getString(R.string.c108),getString(R.string.c109),getString(R.string.c110),getString(R.string.c111),getString(R.string.c112),getString(R.string.c113),getString(R.string.c114),getString(R.string.c115),getString(R.string.c116),getString(R.string.c117),getString(R.string.c118),getString(R.string.c118),getString(R.string.c119),getString(R.string.c120),getString(R.string.c121),getString(R.string.c122),getString(R.string.c123),getString(R.string.c124),getString(R.string.c125),getString(R.string.c126),getString(R.string.c127),getString(R.string.c128),getString(R.string.c129),getString(R.string.c130),getString(R.string.c131),getString(R.string.c132),getString(R.string.c133),getString(R.string.c134),getString(R.string.c135),getString(R.string.c136),getString(R.string.c137),getString(R.string.c138),getString(R.string.c139),getString(R.string.c140),getString(R.string.c141),getString(R.string.c142),getString(R.string.c143),getString(R.string.c144),getString(R.string.c145),getString(R.string.c146),getString(R.string.c147),getString(R.string.c148),getString(R.string.c149),getString(R.string.c150),getString(R.string.c151),getString(R.string.c152),getString(R.string.c153),getString(R.string.c154),getString(R.string.c155),getString(R.string.c156),getString(R.string.c157),getString(R.string.c158),getString(R.string.c159),getString(R.string.c160),getString(R.string.c161),getString(R.string.c162),getString(R.string.c163),getString(R.string.c164),getString(R.string.c165)};

        dogrulukList = new ArrayList<String>(Arrays.asList(dogruArray));
        cesaretList = new ArrayList<String>(Arrays.asList(cesaretArray));


        dogruluk_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonDurum){
                    int say= random.nextInt(dogrulukList.size());
                    builder = new AlertDialog.Builder(context);

                    LayoutInflater inf = getLayoutInflater();
                    View layout= inf.inflate(R.layout.alert_dialog,null);
                    TextView dialog_txt = layout.findViewById(R.id.dialog_txt);

                    builder.setView(layout);
                    dialog_txt.setText(dogrulukList.get(say));
                    builder.show();
                    buttonDurum=false;

                }else{
                    Toast.makeText(context,"Şişeyi Çevirin!",Toast.LENGTH_LONG).show();
                }

            }
        });

        cesaret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (buttonDurum){
                    int say= random.nextInt(cesaretList.size());
                    builder = new AlertDialog.Builder(context);

                    LayoutInflater inf = getLayoutInflater();
                    View layout= inf.inflate(R.layout.alert_dialog,null);
                    TextView dialog_txt = layout.findViewById(R.id.dialog_txt);

                    builder.setView(layout);

                    dialog_txt.setText(cesaretList.get(say));
                    builder.show();
                    buttonDurum=false;

                }else{
                    Toast.makeText(context,"Şişeyi Çevirin!",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    private void init2() {
        txt_ad_21.setText(dat.receiveDataString("isim0",""));
        txt_ad_22.setText(dat.receiveDataString("isim1",""));
    }

    private void init3() {
        txt_ad_31.setText(dat.receiveDataString("isim0",""));
        txt_ad_32.setText(dat.receiveDataString("isim1",""));
        txt_ad_33.setText(dat.receiveDataString("isim2",""));
    }

    private void init4() {
        txt_ad_41.setText(dat.receiveDataString("isim0",""));
        txt_ad_42.setText(dat.receiveDataString("isim1",""));
        txt_ad_43.setText(dat.receiveDataString("isim2",""));
        txt_ad_44.setText(dat.receiveDataString("isim3",""));
    }

    private void init5() {
        txt_ad_51.setText(dat.receiveDataString("isim0",""));
        txt_ad_52.setText(dat.receiveDataString("isim1",""));
        txt_ad_53.setText(dat.receiveDataString("isim2",""));
        txt_ad_54.setText(dat.receiveDataString("isim3",""));
        txt_ad_55.setText(dat.receiveDataString("isim4",""));
    }

    private void init6() {
        txt_ad_61.setText(dat.receiveDataString("isim0",""));
        txt_ad_62.setText(dat.receiveDataString("isim1",""));
        txt_ad_63.setText(dat.receiveDataString("isim2",""));
        txt_ad_64.setText(dat.receiveDataString("isim3",""));
        txt_ad_65.setText(dat.receiveDataString("isim4",""));
        txt_ad_66.setText(dat.receiveDataString("isim5",""));
    }

    private void init7() {
        txt_ad_71.setText(dat.receiveDataString("isim0",""));
        txt_ad_72.setText(dat.receiveDataString("isim1",""));
        txt_ad_73.setText(dat.receiveDataString("isim2",""));
        txt_ad_74.setText(dat.receiveDataString("isim3",""));
        txt_ad_75.setText(dat.receiveDataString("isim4",""));
        txt_ad_76.setText(dat.receiveDataString("isim5",""));
        txt_ad_77.setText(dat.receiveDataString("isim6",""));
    }

    private void init8() {
        txt_ad_81.setText(dat.receiveDataString("isim0",""));
        txt_ad_82.setText(dat.receiveDataString("isim1",""));
        txt_ad_83.setText(dat.receiveDataString("isim2",""));
        txt_ad_84.setText(dat.receiveDataString("isim3",""));
        txt_ad_85.setText(dat.receiveDataString("isim4",""));
        txt_ad_86.setText(dat.receiveDataString("isim5",""));
        txt_ad_87.setText(dat.receiveDataString("isim6",""));
        txt_ad_88.setText(dat.receiveDataString("isim7",""));
    }

    private void init9() {
        txt_ad_91.setText(dat.receiveDataString("isim0",""));
        txt_ad_92.setText(dat.receiveDataString("isim1",""));
        txt_ad_93.setText(dat.receiveDataString("isim2",""));
        txt_ad_94.setText(dat.receiveDataString("isim3",""));
        txt_ad_95.setText(dat.receiveDataString("isim4",""));
        txt_ad_96.setText(dat.receiveDataString("isim5",""));
        txt_ad_97.setText(dat.receiveDataString("isim6",""));
        txt_ad_98.setText(dat.receiveDataString("isim7",""));
        txt_ad_99.setText(dat.receiveDataString("isim8",""));
    }

    private void init10() {
        txt_ad_101.setText(dat.receiveDataString("isim0",""));
        txt_ad_102.setText(dat.receiveDataString("isim1",""));
        txt_ad_103.setText(dat.receiveDataString("isim2",""));
        txt_ad_104.setText(dat.receiveDataString("isim3",""));
        txt_ad_105.setText(dat.receiveDataString("isim4",""));
        txt_ad_106.setText(dat.receiveDataString("isim5",""));
        txt_ad_107.setText(dat.receiveDataString("isim6",""));
        txt_ad_108.setText(dat.receiveDataString("isim7",""));
        txt_ad_109.setText(dat.receiveDataString("isim8",""));
        txt_ad_1010.setText(dat.receiveDataString("isim9",""));
    }

    private void init() {
        bottle = (ImageView) findViewById(R.id.bottle);
        dogruluk_btn = (Button)findViewById(R.id.dogruluk_btn);
        cesaret_btn = (Button)findViewById(R.id.cesaret_btn);
        /// textler

        txt_ad_21 = (TextView) findViewById(R.id.txt_ad_21);
        txt_ad_22 = (TextView) findViewById(R.id.txt_ad_22);
        txt_ad_31 = (TextView) findViewById(R.id.txt_ad_31);
        txt_ad_32 = (TextView) findViewById(R.id.txt_ad_32);
        txt_ad_33 = (TextView) findViewById(R.id.txt_ad_33);
        txt_ad_41 = (TextView) findViewById(R.id.txt_ad_41);
        txt_ad_42 = (TextView) findViewById(R.id.txt_ad_42);
        txt_ad_43 = (TextView) findViewById(R.id.txt_ad_43);
        txt_ad_44 = (TextView) findViewById(R.id.txt_ad_44);
        txt_ad_51 = (TextView) findViewById(R.id.txt_ad_51);
        txt_ad_52 = (TextView) findViewById(R.id.txt_ad_52);
        txt_ad_53 = (TextView) findViewById(R.id.txt_ad_53);
        txt_ad_54 = (TextView) findViewById(R.id.txt_ad_54);
        txt_ad_55 = (TextView) findViewById(R.id.txt_ad_55);
        txt_ad_61 = (TextView) findViewById(R.id.txt_ad_61);
        txt_ad_62 = (TextView) findViewById(R.id.txt_ad_62);
        txt_ad_63 = (TextView) findViewById(R.id.txt_ad_63);
        txt_ad_64 = (TextView) findViewById(R.id.txt_ad_64);
        txt_ad_65 = (TextView) findViewById(R.id.txt_ad_65);
        txt_ad_66 = (TextView) findViewById(R.id.txt_ad_66);
        txt_ad_71 = (TextView) findViewById(R.id.txt_ad_71);
        txt_ad_72 = (TextView) findViewById(R.id.txt_ad_72);
        txt_ad_73 = (TextView) findViewById(R.id.txt_ad_73);
        txt_ad_74 = (TextView) findViewById(R.id.txt_ad_74);
        txt_ad_75 = (TextView) findViewById(R.id.txt_ad_75);
        txt_ad_76 = (TextView) findViewById(R.id.txt_ad_76);
        txt_ad_77 = (TextView) findViewById(R.id.txt_ad_77);
        txt_ad_81 = (TextView) findViewById(R.id.txt_ad_81);
        txt_ad_82 = (TextView) findViewById(R.id.txt_ad_82);
        txt_ad_83 = (TextView) findViewById(R.id.txt_ad_83);
        txt_ad_84 = (TextView) findViewById(R.id.txt_ad_84);
        txt_ad_85 = (TextView) findViewById(R.id.txt_ad_85);
        txt_ad_86 = (TextView) findViewById(R.id.txt_ad_86);
        txt_ad_87 = (TextView) findViewById(R.id.txt_ad_87);
        txt_ad_88 = (TextView) findViewById(R.id.txt_ad_88);
        txt_ad_91 = (TextView) findViewById(R.id.txt_ad_91);
        txt_ad_92 = (TextView) findViewById(R.id.txt_ad_92);
        txt_ad_93 = (TextView) findViewById(R.id.txt_ad_93);
        txt_ad_94 = (TextView) findViewById(R.id.txt_ad_94);
        txt_ad_95 = (TextView) findViewById(R.id.txt_ad_95);
        txt_ad_96 = (TextView) findViewById(R.id.txt_ad_96);
        txt_ad_97 = (TextView) findViewById(R.id.txt_ad_97);
        txt_ad_98 = (TextView) findViewById(R.id.txt_ad_98);
        txt_ad_99 = (TextView) findViewById(R.id.txt_ad_99);
        txt_ad_101 = (TextView) findViewById(R.id.txt_ad_101);
        txt_ad_102 = (TextView) findViewById(R.id.txt_ad_102);
        txt_ad_103 = (TextView) findViewById(R.id.txt_ad_103);
        txt_ad_104 = (TextView) findViewById(R.id.txt_ad_104);
        txt_ad_105 = (TextView) findViewById(R.id.txt_ad_105);
        txt_ad_106 = (TextView) findViewById(R.id.txt_ad_106);
        txt_ad_107 = (TextView) findViewById(R.id.txt_ad_107);
        txt_ad_108 = (TextView) findViewById(R.id.txt_ad_108);
        txt_ad_109 = (TextView) findViewById(R.id.txt_ad_109);
        txt_ad_1010 = (TextView) findViewById(R.id.txt_ad_1010);

    }


    public void spinBottle(View v) {
        if (!spinning) {
            int newDir = random.nextInt(2500);
            float pivotX = bottle.getWidth() / 2;
            float pivotY = bottle.getHeight() / 2;

            Animation rotate = new RotateAnimation(lastDir, newDir, pivotX, pivotY);
            rotate.setDuration(2500);
            rotate.setFillAfter(true);
            rotate.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    spinning = true;
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    spinning = false;
                    buttonDurum=true;
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });

            lastDir = newDir;
            bottle.startAnimation(rotate);
        }
    }

    private void reklam(){
        //reklam
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}