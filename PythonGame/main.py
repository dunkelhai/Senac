# Inicializando o pacote
import pygame

# Criar a tela
screen = pygame.display.set_mode((800, 600))

# Título e Ícone
pygame.display.set_caption("Dragon's Hashtag")
icon = pygame.image.load("dragon.png")
pygame.display.set_icon(icon)

# Jogador
personagem = input("Escolha o personagem 1, 2, 3 ou 4: \n")
personagem = int(personagem)

if personagem == (1):
    playerImg = pygame.image.load("sword.png")
    playerX = 340
    playerY = 480
    playerX_change = 0
    playerY_change = 0

if personagem == (2):
    playerImg = pygame.image.load("axe.png")
    playerX = 340
    playerY = 480

if personagem == (3):
    playerImg = pygame.image.load("dagger.png")
    playerX = 340
    playerY = 480

if personagem == (4):
    playerImg = pygame.image.load("archer.png")
    playerX = 340
    playerY = 480


def player(x, y):
    screen.blit(playerImg, (x, y))


# Game loop
running = True
while running:

    # RGB
    screen.fill((50, 0, 0))

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_ESCAPE:
                running = False

        # Teclado pressionado, checar se é direita ou esquerda
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                playerX_change = -0.5
            if event.key == pygame.K_RIGHT:
                playerX_change = 0.5
            if event.key == pygame.K_UP:
                    playerY_change = -0.5
            if event.key == pygame.K_DOWN:
                    playerY_change = 0.5

        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                playerX_change = 0.0
            if event.key == pygame.K_UP or event.key == pygame.K_DOWN:
                playerY_change = 0.0


    playerX += playerX_change

    if playerX <= 0:
        playerX = 0
    elif playerX >= 736:
        playerX = 736

    playerY += playerY_change

    if playerY <= 0:
        playerY = 0
    elif playerY >= 536:
        playerY = 536

    player(playerX, playerY)
    pygame.display.update()
