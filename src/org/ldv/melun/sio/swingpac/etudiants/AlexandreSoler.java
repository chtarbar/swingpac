package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;
import java.util.List;

import org.ldv.melun.sio.swingpac.Bidule;

public class AlexandreSoler extends Bidule {

	public AlexandreSoler() {
		super("TeemoLapinAS");
		setBackground(Color.YELLOW);
	}

	@Override
	public void doMove() {
		List<Bidule> bidulesProches = this.getBidulesProches(20);
		System.out.println(bidulesProches);

		if (bidulesProches.size() > 1) {
			// 1
			if (bidulesProches.get(0).getDELAY() > this.getDELAY()) {
				if (bidulesProches.get(0).getWidth() >= this.getWidth()) {
					if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoLeft()
							&& this.isGoUp() && this.isGoLeft()) {
						goOnDown();
						goOnRight();
					} else if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoRight()
							&& this.isGoUp() && this.isGoRight()) {
						goOnDown();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoRight()
							&& this.isGoRight() && this.isGoDown()) {
						goOnTop();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoLeft()
							&& this.isGoLeft() && this.isGoDown()) {
						goOnTop();
						goOnRight();
					}
				} else if (bidulesProches.get(0).getWidth() < this.getWidth()) {
					if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoLeft()
							&& this.isGoUp() && this.isGoLeft()) {
						goOnDown();
						goOnRight();
					} else if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoRight()
							&& this.isGoUp() && this.isGoRight()) {
						goOnDown();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoRight()
							&& this.isGoRight() && this.isGoDown()) {
						goOnTop();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoLeft()
							&& this.isGoLeft() && this.isGoDown()) {
						goOnTop();
						goOnRight();
					}

				}
			} else if (bidulesProches.get(0).getWidth() < this.getWidth()) {
				if (bidulesProches.get(0).getWidth() >= this.getWidth()) {
					if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoLeft()) {
						goOnTop();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoRight()) {
						goOnTop();
						goOnRight();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoRight()) {
						goOnDown();
						goOnRight();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoLeft()) {
						goOnDown();
						goOnLeft();

					}
				}
				// 2
				else if (bidulesProches.get(0).getDELAY() < this.getDELAY()) {
					if (bidulesProches.get(0).getWidth() >= this.getWidth()) {
						if (bidulesProches.get(0).isGoUp() && this.isGoUp()) {
							goOnDown();
						} else if (bidulesProches.get(0).isGoDown()
								&& this.isGoDown()) {
							goOnTop();
						}
					} else if (bidulesProches.get(0).getWidth() < this
							.getWidth()) {
						if (bidulesProches.get(0).isGoUp() && this.isGoUp()) {
							goOnDown();
						} else if (bidulesProches.get(0).isGoDown()
								&& this.isGoDown()) {
							goOnTop();
						}
					}

				}
			} else {
				super.doMove();
			}
		}
	}

	@Override
	protected void doAfterImpactByOther() {
		List<Bidule> bidulesProches = this.getBidulesProches(20);
		System.out.println(bidulesProches);

		if (bidulesProches.size() > 1) {
			// 1
			if (bidulesProches.get(0).getDELAY() > this.getDELAY()) {
				if (bidulesProches.get(0).getWidth() >= this.getWidth()) {
					if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoLeft()
							&& this.isGoUp() && this.isGoLeft()) {
						goOnDown();
						goOnRight();
					} else if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoRight()
							&& this.isGoUp() && this.isGoRight()) {
						goOnDown();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoRight()
							&& this.isGoRight() && this.isGoDown()) {
						goOnTop();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoLeft()
							&& this.isGoLeft() && this.isGoDown()) {
						goOnTop();
						goOnRight();
					}
				} else if (bidulesProches.get(0).getWidth() < this.getWidth()) {
					if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoLeft()
							&& this.isGoUp() && this.isGoLeft()) {
						goOnDown();
						goOnRight();
					} else if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoRight()
							&& this.isGoUp() && this.isGoRight()) {
						goOnDown();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoRight()
							&& this.isGoRight() && this.isGoDown()) {
						goOnTop();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoLeft()
							&& this.isGoLeft() && this.isGoDown()) {
						goOnTop();
						goOnRight();
					}

				}
			} else if (bidulesProches.get(0).getWidth() < this.getWidth()) {
				if (bidulesProches.get(0).getWidth() >= this.getWidth()) {
					if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoLeft()) {
						goOnTop();
						goOnLeft();
					} else if (bidulesProches.get(0).isGoUp()
							&& bidulesProches.get(0).isGoRight()) {
						goOnTop();
						goOnRight();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoRight()) {
						goOnDown();
						goOnRight();
					} else if (bidulesProches.get(0).isGoDown()
							&& bidulesProches.get(0).isGoLeft()) {
						goOnDown();
						goOnLeft();

					}
				}
				// 2
				else if (bidulesProches.get(0).getDELAY() < this.getDELAY()) {
					if (bidulesProches.get(0).getWidth() >= this.getWidth()) {
						if (bidulesProches.get(0).isGoUp() && this.isGoUp()) {
							goOnDown();
						} else if (bidulesProches.get(0).isGoDown()
								&& this.isGoDown()) {
							goOnTop();
						}
					} else if (bidulesProches.get(0).getWidth() < this
							.getWidth()) {
						if (bidulesProches.get(0).isGoUp() && this.isGoUp()) {
							goOnDown();
						} else if (bidulesProches.get(0).isGoDown()
								&& this.isGoDown()) {
							goOnTop();
						}
					}

				}
			} else {
				super.doMove();
			}
		}
	}
}
