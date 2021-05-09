package io.catalyte.training.hackhersimageservice.data;

import io.catalyte.training.hackhersimageservice.entities.Image;
import io.catalyte.training.hackhersimageservice.repositories.ImageRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * dataloader loads data in the database when the application is run
 */
@Component
public class DataLoader implements CommandLineRunner {

  @Autowired
  private ImageRepository imageRepository;

  public static final String DEMOGRAPHIC_MEN = "Men";
  public static final String DEMOGRAPHIC_WOMEN = "Women";
  public static final String DEMOGRAPHIC_KIDS = "Kids";

  public static final List<String> TYPES =
      Arrays.asList(
          "Belt",
          "Elbow Pad",
          "Flip Flop",
          "Glove",
          "Hat",
          "Headband",
          "Helmet",
          "Hoodie",
          "Jacket",
          "Pant",
          "Pool Noodle",
          "Shin Guard",
          "Shoe",
          "Short",
          "Sock",
          "Sunglasses",
          "Tank Top",
          "Visor",
          "Wristband");

  public static final List<String> CATEGORIES =
      Arrays.asList(
          "Baseball",
          "Basketball",
          "Boxing",
          "Football",
          "Golf",
          "Hockey",
          "Running",
          "Skateboarding",
          "Soccer",
          "Weightlifting");

  public static final List<String> MENS_TYPES = Arrays
      .asList(
          // Men
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/qv9avvotxzgev0grffsw/core-mens-reversible-golf-belt-c4jrVt.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/7fc26d1c-df68-4c16-a4a1-b3698c431657/vapor-lacrosse-arm-pad-twZCvs.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/660a3105-7600-4628-ae08-d59059d0b899/on-deck-womens-flip-flop-cB99q2.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/d599505c-99dd-4e2b-ae19-015c8943575d/alpha-huarache-elite-baseball-batting-gloves-fWVPgD.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/4bb574d5-1b1f-4174-a5cf-93f55eec58c5/heritage86-mariners-hat-SLVHBQ.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/zyicigkuu937cllnrabl/jordan-dri-fit-jumpman-headband-0DpLgv.png",
          "https://i5.walmartimages.com/asr/c2bc9813-99b7-4854-8693-a93cda3cff15_1.9c0716c2b9092b810689928c741bbc45.jpeg?odnWidth=612&odnHeight=612&odnBg=ffffff",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/8600b55e-9441-4600-890a-a76dd0c5c350/us-mens-fleece-hoodie-2BNq6M.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/21ce8bcf-0d0d-4064-b079-9c791ba5121d/england-windrunner-mens-woven-jacket-1KRLtV.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/d3168d61-0471-41f3-9925-649634e15085/us-mens-fleece-soccer-pants-B8qt4T.png",
          "https://www.proamaus.com.au/wp-content/uploads/2016/11/pool-noodles.jpg",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/kkkd9j6ghd2ifpbqww0c/charge-soccer-shin-guards-gs13m2.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/41d8dc4b-ef04-4e21-98c8-50a4bddd87fb/phantom-gt-elite-fg-firm-ground-soccer-cleat-NRr9S7.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/c4b923a2-549e-464d-8dba-d255277aac3f/fff-mens-soccer-shorts-mRzt0V.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/006394b3-c260-4e9c-a16a-69748df08d4e/spark-lightweight-no-show-running-socks-KkZwrc.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/80610ec4-63a5-40f9-8116-a99b4f63e8a2/windshield-elite-field-tint-sunglasses-7zHW9r.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/8a25a7e2-377d-4dd8-a6ca-8b72effeb10e/replica-oregon-mens-basketball-jersey-lshXLs.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/c2fcd92d-95b1-4859-a5ad-bfb5677b4f37/dri-fit-aerobill-womens-running-visor-2psQ7b.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/movgdjyntm7wkhxjov3i/swoosh-wristbands-CwPs55.png");

  public static final List<String> WOMENS_TYPES = Arrays
      .asList(
          // Women
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/davdvntbnwcpjwlka05j/tech-essentials-single-web-womens-golf-belt-yBe4Rq.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/6cc55919-d544-4542-acb1-0a8789a5fff4/contact-support-elbow-sleeves-n1LtPz.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/jl3pub0twyeecqzma5vn/solay-womens-flip-flop-9RXrb5.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/e21582b9-2a79-43b5-aad0-d9fa029e26b0/accelerate-womens-running-gloves-8VK3XC.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/b9adbf91-b9e1-4270-bc3d-b4c126f2167c/featherlight-womens-running-cap-127RF5.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/8056d702-8aff-466d-84ae-e783c33f2a5d/printed-headband-bHtcMM.png",
          "https://i5.walmartimages.com/asr/3cdf5347-7ebb-4bc5-9d76-749247b54a17_1.1b6e2bd8d33b693d71279139a2a34fa6.jpeg",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/4e3f009f-1b87-4de3-910a-1d83a18f914f/new-york-knicks-essential-womens-nba-full-zip-hoodie-6HgNt2.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/c850509f-dfd6-48aa-bc22-45dd5188191f/celtics-courtside-womens-nba-tracksuit-jacket-jH2HgK.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/70baef2b-1758-42c5-bc50-910471e41e51/vapor-select-womens-3-4-length-softball-pants-G6MkTS.png",
          "https://www.proamaus.com.au/wp-content/uploads/2016/11/pool-noodles.jpg",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/nwvac0av15si1c6r8zzi/mercurial-lite-soccer-shin-guards-sQBtPc.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/795a1d14-8474-40c3-97a5-92cb5cf31d9f/mercurial-superfly-8-academy-mg-multi-ground-soccer-cleat-pbJFG6.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/c755d3b7-6ea0-40c1-a49c-d695b7ba81b1/dri-fit-tempo-oklahoma-womens-running-shorts-x7PP7D.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/5a342b63-6df1-4c82-bb62-4d398fb91999/one-womens-training-ankle-socks-tB7n5G.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/7cecb33a-b735-4b9c-9627-4c2b65cc76c1/show-x3-elite-field-tint-sunglasses-B3JTF6.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/h4hk2r4ksvfv3fqno4ef/giannis-antetokounmpo-bucks-icon-edition-womens-nba-swingman-jersey-PtCShH.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/f94f8e40-ec68-4075-9207-65b9d84be469/nikecourt-advantage-womens-tennis-visor-1tf7rN.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/u0pxg2gsxs93icxsfzfv/jordan-jumpman-wristbands-V9GPOe.png");


  public static final List<String> KIDS_TYPES = Arrays
      .asList(
          // kids
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/b5sgjygld0bag3wm4mxf/kids-reversible-golf-belt-l3bHnQ.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/b1c0f997-4dc9-4dd2-b803-d1dbb77ba1d6/contact-support-shin-knee-elbow-bicep-sleeves-6TJQSM.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/c40f7826-5c83-4817-a8f3-0477b24b89b2/on-deck-mens-flip-flop-McrHWg.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/f01d78ce-aa51-4288-a08a-265d3904b3c3/kids-base-layer-gloves-PpdjtZ.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/1dd6bda9-8942-4a3a-9d4a-6bffc64e8067/toddler-adjustable-hat-HsjHQr.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/495aca2e-4ce4-4f4c-b70a-f6046bca2c5d/fury-big-kids-printed-headband-zXHW1X.png",
          "https://i5.walmartimages.com/asr/051e15c3-ac9d-42ad-ada5-301b0f5909e8_1.c99b6e26dfda0608940b1addf517e521.jpeg?odnWidth=612&odnHeight=612&odnBg=ffffff",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/6b240832-2be4-4d1a-9a8d-59e156e8c3c5/sportswear-tech-fleece-little-kids-full-zip-hoodie-bWPM41.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/d3c56402-6ea6-42b8-9671-e870e3c96836/sportswear-windrunner-big-kids-boys-tie-dye-jacket-lXK2GJ.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/8dac63e5-4a1e-472e-8ff5-22f761e1d204/pro-little-kids-tights-TkdxC0.png",
          "https://www.proamaus.com.au/wp-content/uploads/2016/11/pool-noodles.jpg",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/i2g8ynco2l5l9iek4qb9/charge-kids-soccer-shin-guards-lkqRmt.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/9fe09541-2441-4c98-b804-b0c02516380f/air-vapormax-flyknit-3-big-kids-shoe-T461Dh.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/44339ae4-1bc3-404d-84e4-7a79928bacae/trophy-big-kids-boys-printed-training-shorts-gnMJbH.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/bd446e4a-e22c-48fc-ae4b-aaafcdafb56d/little-kids-tie-dye-crew-socks-3-pairs-3z3Csq.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/7d6efc63-97fd-443e-b0b8-e65a55feea62/stratus-course-tint-sunglasses-qfc5sF.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/y5niradvd02o4zrw4uwg/rudy-gobert-utah-jazz-icon-edition-swingman-big-kids-nba-jersey-kN5Hjz.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/d4617051-bf5e-4374-8d9f-cab836a9d894/aerobill-womens-golf-visor-nh3JSN.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/l3aiqkt27yejk8m56mvv/jordan-jumpman-wristband-V9GPOe.png");

  public static final List<String> MENS_CATEGORIES = Arrays
      .asList(
          "https://static.nike.com/a/images/q_auto:eco/t_product_v1/f_auto/dpr_1.0/w_586,c_limit/93b8a312-769f-488a-a267-dfe1a13ade85/force-zoom-trout-7-mens-baseball-cleat-PJD04W.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/1d6bbd25-b2c8-4a3d-b7c0-7db118b77f82/elite-championship-indoor-basketball-TxPnb5.png",
          "https://www.roninwear.com/images/everlast-powerlock-pro-hook--loop-training-gloves-red-grey-1.jpg",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/bdschtiumr4ojfxqazjv/seattle-seahawks-dk-metcalf-mens-game-football-jersey-wz0KCt.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/cd25b83e-81e6-49fa-a337-2645271ccfef/air-sport-golf-bag-SHdW9f.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/swf5in2u7bwfmoyf1dbb/team-usa-replica-mens-hockey-jersey-8rd2bG.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/60740f48-a3d7-441d-887f-fdb85b2493a6/zoomx-invincible-run-flyknit-mens-running-shoe-NgvDVX.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/dlgldxulxcgsz5v6du9z/sb-zoom-stefan-janoski-rm-skate-shoe-fCvbQF.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/588d6f88-4860-4161-beef-f15203b9ff81/tiempo-legend-8-pro-fg-firm-ground-soccer-cleat-xn2l5X.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/3d15f7d7-461f-4eff-85bd-0a100c234e2d/free-metcon-3-mens-training-shoe-HT6hdN.png");

  public static final List<String> WOMENS_CATEGORIES = Arrays
      .asList(
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/tr3eca2hhqyy8jgly7xz/hyperdiamond-softball-fielding-glove-kbGtFp.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/580ed8b2-bc96-4b1c-8ad9-ee6ae3b7e898/giannis-skills-basketball-C4wFXn.png",
          "https://target.scene7.com/is/image/Target/GUEST_e905fa98-5bfb-41ae-a9a2-4f69df87989c?wid=488&hei=488&fmt=pjpeg",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/s8ycovofayvkungjntju/tennessee-titans-marcus-mariota-womens-football-home-fsLmVB.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/86c7c78c-a9b6-499b-928e-a19387e98bef/air-max-270-g-golf-shoe-xvxwdZ.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/cjhyj6uq38ekbbdkca9p/team-canada-replica-mens-hockey-jersey-TtFSwJ.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/b1a33345-c7d9-4e62-a837-4efa452e5fb7/zoomx-invincible-run-flyknit-womens-running-shoe-8v734r.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/eb7db080-dc1e-44cd-bd5d-28619ab11ba7/sb-zoom-blazer-mid-premium-skate-shoe-bcP1Nd.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/4ae7be1f-b147-4287-99ec-b7a31181337e/mercurial-fade-soccer-ball-FhjC3K.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/e2f3c846-8b83-4d50-bfa0-f96dd2b0f87f/resistance-band-light-w3XsX9.png");

  public static final List<String> KIDS_CATEGORIES = Arrays
      .asList(
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/8aa4a941-09b0-4968-b54d-783a4ae1fa67/alpha-edge-kids-baseball-fielding-glove-R5gGc1.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/189ea755-6b84-42e3-bafd-5df39b433c9f/lebron-skills-basketball-size-3-8VBknx.png",
          "https://m.media-amazon.com/images/I/41yZn8S512L._SL500_.jpg",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/f2hluw0kzewljlkh6y1e/mini-spin-football-g0JJVv.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/i1-df0572fd-86f8-4fd1-9fb6-7b9ecf9127d4/sport-lite-golf-bag-1Ch6SL.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/cjhyj6uq38ekbbdkca9p/team-canada-replica-mens-hockey-jersey-TtFSwJ.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/d9a9654a-a182-4651-9376-15af0fa01d79/air-zoom-pegasus-38-little-big-kids-running-shoe-kGSw18.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/f7fa32f5-ad8b-4d76-ab43-013bd47f8964/sb-zoom-stefan-janoski-canvas-35y-7y-big-kids-skateboarding-shoe-r838o7.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/943d4cfd-ed62-473a-94e1-f3a3d08fbf23/flight-soccer-ball-rPkJLP.png",
          "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/3a86b154-9f38-422f-9bd6-1e2de2fc88e4/push-up-grip-3-QP8T0m.png");

  /**
   * method which loads the images
   *
   * @param args
   * @throws Exception
   */
  @Override
  public void run(String... args) throws Exception {
    loadImages();
  }

  private void loadImages() {
    // default image
    imageRepository
        .save(new Image("", "", "", "", "https://www.tibs.org.tw/images/default.jpg"));

    for (int i = 0; i < MENS_TYPES.size(); i++) {
      Image image = new Image();
      image.setType(TYPES.get(i));
      image.setDemographic(DEMOGRAPHIC_MEN);
      image.setImageUrl(MENS_TYPES.get(i));
      imageRepository.save(image);
    }

    for (int i = 0; i < KIDS_TYPES.size(); i++) {
      Image image = new Image();
      image.setType(TYPES.get(i));
      image.setDemographic(DEMOGRAPHIC_KIDS);
      image.setImageUrl(KIDS_TYPES.get(i));
      imageRepository.save(image);
    }

    for (int i = 0; i < WOMENS_TYPES.size(); i++) {
      Image image = new Image();
      image.setType(TYPES.get(i));
      image.setDemographic(DEMOGRAPHIC_WOMEN);
      image.setImageUrl(WOMENS_TYPES.get(i));
      imageRepository.save(image);
    }

    for (int i = 0; i < MENS_CATEGORIES.size(); i++) {
      Image image = new Image();
      image.setCategory(CATEGORIES.get(i));
      image.setDemographic(DEMOGRAPHIC_MEN);
      image.setImageUrl(MENS_CATEGORIES.get(i));
      imageRepository.save(image);
    }

    for (int i = 0; i < KIDS_CATEGORIES.size(); i++) {
      Image image = new Image();
      image.setCategory(CATEGORIES.get(i));
      image.setDemographic(DEMOGRAPHIC_KIDS);
      image.setImageUrl(KIDS_CATEGORIES.get(i));
      imageRepository.save(image);
    }

    for (int i = 0; i < WOMENS_CATEGORIES.size(); i++) {
      Image image = new Image();
      image.setCategory(CATEGORIES.get(i));
      image.setDemographic(DEMOGRAPHIC_WOMEN);
      image.setImageUrl(WOMENS_CATEGORIES.get(i));
      imageRepository.save(image);
    }

  }
}
